package com.example.demo;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;

public class ShieldImage {

	private static final String IMAGE_NAME = "/com/example/demo/images/shield.png";
	private static final int SHIELD_SIZE = 200; // 调整大小以便观察
	private HBox container; // 容器
	private ImageView shieldImageView; // 盾牌图像

	public ShieldImage(double xPosition, double yPosition) {
		initializeContainer(xPosition, yPosition);
		initializeShieldImage();
	}

	private void initializeContainer(double xPosition, double yPosition) {
		container = new HBox();
		container.setLayoutX(xPosition);
		container.setLayoutY(yPosition);
		container.setVisible(false); // 初始状态设置为不可见
	}

	private void initializeShieldImage() {
		shieldImageView = new ImageView();
		URL imageUrl = getClass().getResource(IMAGE_NAME);
		if (imageUrl != null) {
			shieldImageView.setImage(new Image(imageUrl.toExternalForm()));
		}
		shieldImageView.setFitHeight(SHIELD_SIZE);
		shieldImageView.setFitWidth(SHIELD_SIZE);
		shieldImageView.setOpacity(1.0); // 确保不透明
		shieldImageView.setPreserveRatio(true);
		container.getChildren().add(shieldImageView); // 将图像添加到容器中
	}

	/**
	 * 动态设置盾牌的位置
	 *
	 * @param x X坐标
	 * @param y Y坐标
	 */
	public void setPosition(double x, double y) {
		Platform.runLater(() -> {
			container.setLayoutX(x);
			container.setLayoutY(y);
		});
	}

	public void showShield() {
		Platform.runLater(() -> {
			container.setVisible(true);
			container.toFront(); // 将盾牌图像置于最前
		});
	}

	public void hideShield() {
		Platform.runLater(() -> {
			container.setVisible(false);
		});
	}

	public HBox getContainer() {
		return container; // 提供容器给外部调用
	}
}