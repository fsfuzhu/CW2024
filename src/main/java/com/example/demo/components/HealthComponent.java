// HealthComponent.java
package com.example.demo.components;

import com.example.demo.actors.ActiveActor;

/**
 * Manages the health of an actor.
 */
public class HealthComponent {
    private int maxHealth;
    private int currentHealth;
    private ActiveActor owner;

    /**
     * Constructs a HealthComponent with specified max health.
     *
     * @param owner     the owning actor.
     * @param maxHealth maximum health.
     */
    public HealthComponent(ActiveActor owner, int maxHealth) {
        this.owner = owner;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    /**
     * Applies damage to the owner.
     *
     * @param damage amount of damage.
     */
    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth <= 0) {
            currentHealth = 0;
            owner.destroy();
        }
    }

    /**
     * Heals the owner.
     *
     * @param amount amount to heal.
     */
    public void heal(int amount) {
        currentHealth = Math.min(currentHealth + amount, maxHealth);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setCurrentHealth(int health) {
        currentHealth = Math.max(0, Math.min(health, maxHealth));
        if (currentHealth == 0) owner.destroy();
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        if (currentHealth > maxHealth) currentHealth = maxHealth;
    }

    public void reset() {
        currentHealth = maxHealth;
    }
}