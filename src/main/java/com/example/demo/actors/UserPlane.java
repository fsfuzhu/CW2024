package com.example.demo.actors;

import com.example.demo.components.AnimationComponent;
import com.example.demo.components.ShootingComponent;
import com.example.demo.levels.LevelParent;
import javafx.scene.Group;

public class UserPlane extends ActiveActor {

    private static final double Y_UPPER_BOUND = -40, Y_LOWER_BOUND = 600.0;
    private static final double X_LEFT_BOUND = 0.0, X_RIGHT_BOUND = 800.0;
    private static final double INITIAL_X_POSITION = 5.0, INITIAL_Y_POSITION = 300.0;
    private static final int IMAGE_HEIGHT = 100, VERTICAL_VELOCITY = 8, HORIZONTAL_VELOCITY = 8;
    private static final double PROJECTILE_X_OFFSET = 110, PROJECTILE_Y_OFFSET = 45;
    private static final double FIRE_RATE = 5.0;
    private static final int POWER_UP_THRESHOLD = 5;

    private int planeImageIndex = 0; // 初始为0，对应userplane.png
    private static final String[] PLANE_IMAGES = {"userplane.png", "userplane2.png", "userplane3.png"};

    private int verticalVelocityMultiplier = 0, horizontalVelocityMultiplier = 0;
    private int numberOfKills = 0, powerUpCount = 0, extraBulletRows = 0;

    private ShootingComponent shootingComponent;
    private AnimationComponent animationComponent;

    // 移除静态 INITIAL_HEALTH，改为实例变量
    private int initialHealth;

    // 修改构造函数以接受初始健康值
    public UserPlane(int initialHealth) {
        super(PLANE_IMAGES[0], IMAGE_HEIGHT, INITIAL_X_POSITION, INITIAL_Y_POSITION, initialHealth);
        this.initialHealth = initialHealth;
        getCollisionComponent().setHitboxSize(IMAGE_HEIGHT * 0.8, IMAGE_HEIGHT);
        getMovementComponent().setVelocity(0, 0);
        shootingComponent = new ShootingComponent(this, FIRE_RATE, null, PROJECTILE_X_OFFSET, PROJECTILE_Y_OFFSET);
        shootingComponent.startFiring();
    }

    // 保留无参构造以防需要
    public UserPlane() {
        this(5); // 默认健康值为5
    }

    public void setAnimationComponent(AnimationComponent animationComponent) {
        this.animationComponent = animationComponent;
    }

    public void doubleFireRate() {
        shootingComponent.setFireRate(shootingComponent.getFireRate() + 1);
        System.out.println("Fire rate doubled!");
    }

    public void addExtraBulletRow() {
        shootingComponent.addBulletRow();
        extraBulletRows++;
        System.out.println("Extra bullet row added! Total rows: " + shootingComponent.getBulletRows());
    }

    @Override
    public void updateActor(double deltaTime, LevelParent level) {
        updatePosition();
        getCollisionComponent().updateHitBoxPosition();
        if (shootingComponent.getProjectilePool() == null) {
            shootingComponent.setProjectilePool(level.getUserProjectilePool());
        }
        shootingComponent.update(deltaTime, level);
    }

    public void incrementPowerUpCount() {
        powerUpCount++;
        System.out.println("Power-ups collected: " + powerUpCount);
        if (powerUpCount % POWER_UP_THRESHOLD == 0) {
            if (animationComponent != null) {
                double x = getCollisionComponent().getHitboxX() + getCollisionComponent().getHitboxWidth() * 1.5;
                double y = getCollisionComponent().getHitboxY() + getCollisionComponent().getHitboxHeight();
                animationComponent.playLevelUp(x, y, 5.0);
            }
            addExtraBulletRow();
            planeImageIndex = Math.min(planeImageIndex + 1, PLANE_IMAGES.length - 1);
            String newImage = PLANE_IMAGES[planeImageIndex];
            setImageViewImage(newImage);
        }
    }

    public void moveUp() {
        verticalVelocityMultiplier = -1;
        updateVelocity();
    }

    public void moveDown() {
        verticalVelocityMultiplier = 1;
        updateVelocity();
    }

    public void stopVerticalMovement() {
        verticalVelocityMultiplier = 0;
        updateVelocity();
    }

    public void moveLeft() {
        horizontalVelocityMultiplier = -1;
        updateVelocity();
    }

    public void moveRight() {
        horizontalVelocityMultiplier = 1;
        updateVelocity();
    }

    public void stopHorizontalMovement() {
        horizontalVelocityMultiplier = 0;
        updateVelocity();
    }

    private void updateVelocity() {
        getMovementComponent().setVelocity(HORIZONTAL_VELOCITY * horizontalVelocityMultiplier, VERTICAL_VELOCITY * verticalVelocityMultiplier);
    }

    public int getNumberOfKills() {
        return numberOfKills;
    }

    public void incrementKillCount() {
        numberOfKills++;
    }

    @Override
    public void updatePosition() {
        double initialTranslateX = getTranslateX(), initialTranslateY = getTranslateY();
        super.updatePosition();
        double newX = getLayoutX() + getTranslateX(), newY = getLayoutY() + getTranslateY();
        if (newX < X_LEFT_BOUND || newX > X_RIGHT_BOUND) setTranslateX(initialTranslateX);
        if (newY < Y_UPPER_BOUND || newY > Y_LOWER_BOUND) setTranslateY(initialTranslateY);
    }
}