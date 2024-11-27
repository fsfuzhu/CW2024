// ShootingComponent.java

package com.example.demo.components;

import com.example.demo.actors.ActiveActor;
import com.example.demo.levels.LevelParent;
import com.example.demo.projectiles.Projectile;
import com.example.demo.utils.ObjectPool;

public class ShootingComponent {
    private double fireRate; // 每秒发射次数
    private double timeSinceLastShot; // 距离上次射击的时间
    private ObjectPool<Projectile> projectilePool;
    private ActiveActor owner; // 将类型修改为 FighterPlane
    private double projectileXOffset;
    private double projectileYOffset;
    private boolean isFiring;

    public ShootingComponent(ActiveActor owner, double fireRate, ObjectPool<Projectile> projectilePool, double projectileXOffset, double projectileYOffset) {
        this.owner = owner;
        this.fireRate = fireRate;
        this.projectilePool = projectilePool;
        this.projectileXOffset = projectileXOffset;
        this.projectileYOffset = projectileYOffset;
        this.timeSinceLastShot = 0;
        this.isFiring = false;
    }

    public void update(double deltaTime, LevelParent level) {
        if (isFiring) {
            timeSinceLastShot += deltaTime;
            if (shouldFire()) {
                fire(level);
                timeSinceLastShot = 0;
            }
        }
    }

    private boolean shouldFire() {
        return timeSinceLastShot >= (1.0 / fireRate);
    }

    private void fire(LevelParent level) {
        if (projectilePool == null) {
            // 如果 projectilePool 为空，则无法发射子弹
            return;
        }

        Projectile projectile = projectilePool.acquire();
        if (projectile != null) {
            double x = owner.getProjectileXPosition(projectileXOffset);
            double y = owner.getProjectileYPosition(projectileYOffset);
            projectile.resetPosition(x, y);
            level.getRoot().getChildren().add(projectile);
            level.addProjectile(projectile, owner);
        }
    }

    public void startFiring() {
        isFiring = true;
    }

    public void stopFiring() {
        isFiring = false;
        timeSinceLastShot = 0;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    // 添加以下 getter 和 setter 方法
    public ObjectPool<Projectile> getProjectilePool() {
        return projectilePool;
    }

    public void setProjectilePool(ObjectPool<Projectile> projectilePool) {
        this.projectilePool = projectilePool;
    }
}
