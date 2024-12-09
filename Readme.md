# COMP2042 Junru Wang Coursework

## GitHub Repository

You can view the GitHub repository for this project here: [https://github.com/fsfuzhu/CW2024](https://github.com/fsfuzhu/CW2024)

## Build Guide

This project uses [Maven](https://maven.apache.org/) for building and depends on [JavaFX](https://openjfx.io/) and JUnit for testing. Below are the steps to compile and run the project.

### Requirements

1. **Java Development Kit (JDK) 19**  
   Ensure that JDK 19 is installed on your system. Set the `JAVA_HOME` environment variable to point to your JDK installation directory.

2. **Maven**  
   Install Maven version 3.8.x or higher. Ensure that the `mvn` command is available in your terminal.  
   Reference: [Maven Installation Guide](https://maven.apache.org/install.html)

3. **IntelliJ IDEA (Recommended)**  
   This project is developed using IntelliJ IDEA. Ensure that you have [IntelliJ IDEA](https://www.jetbrains.com/idea/) installed and properly configured.

### Build Steps

1. **Clone the Repository**  
   Open your terminal and execute:  
   ```bash
   git clone https://github.com/fsfuzhu/CW2024.git
   ```

2. **Navigate to Project Directory**  
   ```bash
   cd CW2024
   ```

3. **Compile the Code**  
   Use Maven to clean and compile the project:  
   ```bash
   mvn clean compile
   ```
   This command will download all necessary dependencies and compile the code.

4. **Run the Application**  
   The project uses the JavaFX Maven plugin to run the application. Execute:  
   ```bash
   mvn javafx:run
   ```
   This command will build and launch the application's GUI.

### Additional Notes

- The `pom.xml` file includes all required dependencies, including JavaFX controls, FXML, Graphics, Media, Swing components, and the JUnit testing framework.
- If you encounter issues with missing JavaFX components or version mismatches during runtime, ensure that you have the JavaFX SDK version specified in `pom.xml` installed. Alternatively, adjust the version in `pom.xml` to match your environment.

## File Change List

### Original Files (Before Changes)

```
.\src\main\java\module-info.java
.\src\main\java\com\example\demo\ActiveActor.java
.\src\main\java\com\example\demo\ActiveActorDestructible.java
.\src\main\java\com\example\demo\Boss.java
.\src\main\java\com\example\demo\BossProjectile.java
.\src\main\java\com\example\demo\Destructible.java
.\src\main\java\com\example\demo\EnemyPlane.java
.\src\main\java\com\example\demo\EnemyProjectile.java
.\src\main\java\com\example\demo\FighterPlane.java
.\src\main\java\com\example\demo\GameOverImage.java
.\src\main\java\com\example\demo\HeartDisplay.java
.\src\main\java\com\example\demo\LevelOne.java
.\src\main\java\com\example\demo\LevelParent.java
.\src\main\java\com\example\demo\LevelTwo.java
.\src\main\java\com\example\demo\LevelView.java
.\src\main\java\com\example\demo\LevelViewLevelTwo.java
.\src\main\java\com\example\demo\Projectile.java
.\src\main\java\com\example\demo\ShieldImage.java
.\src\main\java\com\example\demo\UserPlane.java
.\src\main\java\com\example\demo\UserProjectile.java
.\src\main\java\com\example\demo\WinImage.java
.\src\main\java\com\example\demo\controller\Controller.java
.\src\main\java\com\example\demo\controller\Main.java
```

### Updated Files (After Changes)

```
.\src\main\java\module-info.java
.\src\main\java\com\example\demo\actors\Actor\Actor.java
.\src\main\java\com\example\demo\actors\Actor\ActorLevelUp.java
.\src\main\java\com\example\demo\actors\Actor\Boss.java
.\src\main\java\com\example\demo\actors\Actor\BossTwo.java
.\src\main\java\com\example\demo\actors\Actor\EnemyPlaneOne.java
.\src\main\java\com\example\demo\actors\Actor\EnemyPlaneTwo.java
.\src\main\java\com\example\demo\actors\Actor\HeartItem.java
.\src\main\java\com\example\demo\actors\Actor\Shield.java
.\src\main\java\com\example\demo\actors\Actor\UserPlane.java
.\src\main\java\com\example\demo\actors\Projectile\BossProjectile.java
.\src\main\java\com\example\demo\actors\Projectile\BossTwoProjectile.java
.\src\main\java\com\example\demo\actors\Projectile\BulletFactory.java
.\src\main\java\com\example\demo\actors\Projectile\EnemyProjectile.java
.\src\main\java\com\example\demo\actors\Projectile\Projectile.java
.\src\main\java\com\example\demo\actors\Projectile\UserProjectile.java
.\src\main\java\com\example\demo\components\AnimationComponent.java
.\src\main\java\com\example\demo\components\CollisionComponent.java
.\src\main\java\com\example\demo\components\HealthComponent.java
.\src\main\java\com\example\demo\components\MovementComponent.java
.\src\main\java\com\example\demo\components\ShootingComponent.java
.\src\main\java\com\example\demo\components\SoundComponent.java
.\src\main\java\com\example\demo\controller\Controller.java
.\src\main\java\com\example\demo\controller\Main.java
.\src\main\java\com\example\demo\interfaces\Destructible.java
.\src\main\java\com\example\demo\interfaces\Hitbox.java
.\src\main\java\com\example\demo\interfaces\LevelChangeListener.java
.\src\main\java\com\example\demo\interfaces\ObjectFactory.java
.\src\main\java\com\example\demo\levels\LevelOne.java
.\src\main\java\com\example\demo\levels\LevelParent.java
.\src\main\java\com\example\demo\levels\LevelThree.java
.\src\main\java\com\example\demo\levels\LevelTwo.java
.\src\main\java\com\example\demo\ui\GameOverImage.java
.\src\main\java\com\example\demo\ui\HeartDisplay.java
.\src\main\java\com\example\demo\ui\MainMenu.java
.\src\main\java\com\example\demo\ui\SettingsPage.java
.\src\main\java\com\example\demo\ui\WinImage.java
.\src\main\java\com\example\demo\utils\GameSettings.java
.\src\main\java\com\example\demo\utils\KeyBindings.java
.\src\main\java\com\example\demo\utils\ObjectPool.java
.\src\test\java\com\example\demo\actors\Actor\BossTest.java
.\src\test\java\com\example\demo\actors\Actor\BossTwoTest.java
.\src\test\java\com\example\demo\actors\Projectile\ProjectileTest.java
.\src\test\java\com\example\demo\components\CollisionComponentTest.java
.\src\test\java\com\example\demo\components\HealthComponentTest.java
.\src\test\java\com\example\demo\components\MovementComponentTest.java
```

## Change Overview

This update involves reorganizing the project's file structure, refactoring classes, and introducing new functionalities. Below is a detailed categorization of the changes:

### Deleted Files/Classes

- **Base Classes Removed and Split:**
  - `ActiveActor.java`, `ActiveActorDestructible.java`, `FighterPlane.java`, `EnemyPlane.java`, etc., have been deleted.
  - The functionalities of these classes have been integrated into the new `Actor` base class and related components (e.g., `MovementComponent`, `HealthComponent`, `ShootingComponent`, etc.) for better modularization and management.

- **UI Classes Merged:**
  - `LevelViewLevelTwo.java`, `ShieldImage.java`, etc., have been merged into new classes such as `LevelView`, `Shield`, etc., and no longer exist as separate files.

### Added Files/Classes

- **Component Classes:**
  - `AnimationComponent.java`, `CollisionComponent.java`, `HealthComponent.java`, `MovementComponent.java`, `ShootingComponent.java`, `SoundComponent.java`  
    Introduced component classes for managing animation, collision detection, health, movement logic, shooting behavior, and sound effects, achieving high modularity and reusability.

- **Utility Classes and Interfaces:**
  - `GameSettings.java`, `KeyBindings.java`, `ObjectPool.java`, `Destructible.java`, `Hitbox.java`, `LevelChangeListener.java`, `ObjectFactory.java`  
    Added utility classes and interfaces for managing game settings, key bindings, object pooling, and defining essential interfaces, enhancing the project's extensibility and flexibility.

- **UI Classes:**
  - `MainMenu.java`, `SettingsPage.java`  
    Added main menu and settings page classes, providing functionalities for game start, settings adjustments, and exiting.

- **Level Classes:**
  - `LevelThree.java`  
    Added a third level class, expanding the game's level content and challenge.

- **Actors / Projectile Related Classes:**
  - `Actor.java`, `ActorLevelUp.java`, `BossTwo.java`, `EnemyPlaneOne.java`, `EnemyPlaneTwo.java`, `HeartItem.java`, `Shield.java`  
    Added and refactored various Actor classes to support more complex game logic and interactive behaviors.

  - `BossTwoProjectile.java`, `BulletFactory.java`  
    Added BossTwo's projectile classes and a BulletFactory class to support the creation and management of different projectile types.

### Modified and Renamed Files/Classes

- **Class Locations and Package Structure Adjustments:**
  - Multiple classes have been moved from the `com.example.demo` package to more refined package structures such as `com.example.demo.actors.Actor`, `com.example.demo.actors.Projectile`, `com.example.demo.components`, `com.example.demo.levels`, `com.example.demo.ui`, `com.example.demo.utils`, etc., improving code organization and maintainability.

- **Functionality Refactoring and Componentization:**
  - The original `Boss` class has been refactored into `BossTwo.java`, integrating animation, sound, and collision detection functionalities via components.
  - The `UserProjectile.java` class now includes dynamic image switching and object pooling mechanisms to enhance projectile management efficiency and flexibility.

- **UI Classes Refactored and Optimized:**
  - `WinImage.java` and `GameOverImage.java` have been moved to the `com.example.demo.ui` package and simplified UI management logic with unified display methods.
  - `HeartDisplay.java` has been optimized with an `HBox` container for better arrangement and display of heart icons, enhancing visual effects and dynamic update capabilities.

### Merged/Renamed Files

- **Base Classes Merged and Split:**
  - The functionalities of the original `ActiveActor` and `ActiveActorDestructible` classes have been split and integrated into the new `Actor` base class and its components, achieving single-responsibility and modular management.

- **Projectile Classes Refactored:**
  - `BossProjectile.java` and `UserProjectile.java` have been refactored and moved to the `com.example.demo.actors.Projectile` package. Additionally, the `BulletFactory.java` class was added to support the creation and management of various projectile types, enhancing efficiency and flexibility.

- **UI Class Merging:**
  - The functionalities of `LevelViewLevelTwo.java` have been integrated into the new `LevelView.java` class, streamlining UI element management across different levels and reducing class redundancy.

## Detailed Change Descriptions

### Added Java Classes

#### `MovementComponent` (Componentized Movement Management)

**Location:** `com.example.demo.components.MovementComponent`

**Purpose and Functionality:**  
The `MovementComponent` class manages the movement logic of Actors, including speed settings and position updates. By encapsulating movement logic within an independent component, it enables the reuse and independent management of movement functionalities.

**Features:**
- Set and get horizontal and vertical speed for Actors.
- Update Actor's position based on speed.
- Provide flexible movement control interfaces, supporting various movement modes.

#### `HealthComponent` (Componentized Health Management)

**Location:** `com.example.demo.components.HealthComponent`

**Purpose and Functionality:**  
The `HealthComponent` class manages the health values of Actors, including initialization, reduction, and querying of health. By isolating health management into a separate component, it centralizes and reuses health logic across different Actors.

**Features:**
- Initialize maximum and current health values for Actors.
- Provide `takeDamage(int damage)` method to reduce health.
- Provide `heal(int amount)` method to increase health, up to maximum health.
- Provide methods to get current and maximum health values.
- Manage Actor's death state and trigger related logic.

#### `CollisionComponent` (Componentized Collision Detection)

**Location:** `com.example.demo.components.CollisionComponent`

**Purpose and Functionality:**  
The `CollisionComponent` class manages collision detection logic for Actors, including the definition and updating of collision boxes. By encapsulating collision detection into a separate component, it enables reuse and centralized management of collision logic.

**Features:**
- Define and initialize the size and position of an Actor's collision box.
- Update the collision box position to match the Actor's current coordinates.
- Provide methods to detect collisions with other objects.
- Support various collision detection strategies.

#### `ActorLevelUp` (Level-Up Power-Up)

**Location:** `com.example.demo.actors.Actor.ActorLevelUp`

**Purpose and Functionality:**  
The `ActorLevelUp` class represents a level-up power-up in the game. When collected by the player, it increases the player's firepower. This power-up moves in a sine wave pattern across the screen and is destroyed upon collection or moving out of the screen.

**Features:**
- **Movement Mode:** Moves leftward horizontally with a sine wave vertical oscillation, enhancing visual effects.
- **Pickup Logic:** Increases player's firepower upon collection and plays a corresponding sound effect.
- **Destruction Conditions:** Automatically destroyed upon being collected by the player or moving out of the screen, freeing resources.
- **Sound Effects:** Plays a pickup sound to enhance user experience.

#### `HeartItem` (Health Restoration Power-Up)

**Location:** `com.example.demo.actors.Actor.HeartItem`

**Purpose and Functionality:**  
The `HeartItem` class represents a health restoration power-up in the game. When collected by the player, it restores a certain amount of health. This power-up moves leftward horizontally with a sine wave vertical oscillation, enhancing visual effects.

**Features:**
- **Movement Mode:** Moves leftward horizontally with a sine wave vertical oscillation, enhancing visual appearance.
- **Pickup Logic:** Restores a certain amount of health upon collection and plays a corresponding sound effect.
- **Destruction Conditions:** Automatically destroyed upon being collected by the player or moving out of the screen, freeing resources.
- **Sound Effects:** Plays a health pickup sound to enhance user experience.

#### `BulletFactory` (Projectile Factory)

**Location:** `com.example.demo.actors.Projectile.BulletFactory`

**Purpose and Functionality:**  
The `BulletFactory` class is used to create and reset different types of projectile objects, adhering to the factory design pattern. This factory supports the creation of user projectiles, enemy projectiles, and various Boss projectiles, facilitating dynamic generation and management of projectile objects in the game.

**Features:**
- **Projectile Creation:** Creates projectile objects based on specified types (e.g., "user", "enemy", "boss", "bossTwo").
- **Projectile Resetting:** Provides methods to reset projectile objects for object pool reuse, enhancing game performance.
- **Type Management:** Supports multiple projectile types, enabling flexible application across different game scenarios.
- **Extensibility:** Easily add new projectile types to meet game expansion requirements.

#### `MainMenu` (Main Menu)

**Location:** `com.example.demo.ui.MainMenu`

**Purpose and Functionality:**  
The `MainMenu` class represents the main menu of the application, providing options to start the game, open settings, or exit the game. Through an intuitive user interface, it allows players to easily navigate to different game functionalities.

**Features:**
- **Background Management:**  
  Sets the main menu's background image (`StartMenu.png`) to ensure visual consistency with the game theme.

- **Button Creation:**  
  Creates "Start Game", "Settings", and "Exit Game" buttons, providing corresponding operational functionalities. Buttons include hover effects to enhance user experience.

- **Event Handling:**  
  - **Start Game:** Calls the controller's `launchGame` method to initiate the game process.
  - **Settings:** Displays the settings page, allowing players to adjust game settings.
  - **Exit Game:** Calls the controller's `exitGame` method to safely exit the application.

- **UI Layout:**  
  Adds the background image and buttons to the root group and centers them, ensuring consistent layout across different screen sizes.

#### `SettingsPage` (Settings Page)

**Location:** `com.example.demo.ui.SettingsPage`

**Purpose and Functionality:**  
The `SettingsPage` class represents a user interface for managing game settings, including key bindings and volume controls. By providing intuitive controls, it allows players to customize their game experience.

**Features:**
- **Background Management:**  
  Sets a semi-transparent black background to ensure the settings page content stands out visually.

- **Title:**  
  Displays the "Settings" title with white font and shadow effects to enhance readability.

- **Volume Control:**  
  - **BGM Volume:** Uses sliders to adjust background music volume, displaying the current volume percentage in real-time.
  - **SFX Volume:** Uses sliders to adjust sound effects volume, displaying the current volume percentage in real-time.
  - **Event Listeners:** Updates the `SoundComponent`'s volume settings and refreshes the displayed volume labels when slider values change.

- **Key Bindings:**  
  - **Key Buttons:** Creates buttons for "Up Key", "Down Key", "Left Key", and "Right Key", displaying the currently bound keys.
  - **Key Binding Setup:** When buttons are clicked, a new window prompts the player to press a new key for binding. After keypress, the binding is updated and the button display is refreshed.

- **Button Styling:**  
  Creates buttons with transparent backgrounds and white text, adding shadow effects. Buttons change color and text color on hover to enhance interactivity.

- **Back and Main Menu Buttons:**  
  - **Back:** Returns to the previous interface, hiding the settings page.
  - **Return to Main Menu:** Returns to the main menu, closing the settings page.

- **UI Layout:**  
  Uses vertical (`VBox`) and horizontal (`HBox`) box layouts to organize controls, ensuring the interface is clean and easy to navigate.

#### `LevelThree` (Third Level)

**Location:** `com.example.demo.levels.LevelThree.java`

**Purpose and Functionality:**  
The `LevelThree` class represents the third level of the game. This level introduces a powerful Boss enemy (`BossTwo`) and includes enhanced player abilities through power-ups and health restoration items. The level concludes when the Boss is defeated or the player is destroyed. It inherits from the `LevelParent` class to utilize shared level functionalities.

**Change Summary:**
1. **Class Location and Package Structure Adjustment:**  
   - Moved from the `com.example.demo` package to the `com.example.demo.levels` package, aligning with the level management structure.

2. **Boss Integration and Animation Optimization:**  
   - Introduced `BossTwo` as the main enemy with complex shooting patterns and movement logic.
   - Implemented Boss entrance animations to enhance visual effects and dynamism.

3. **Enhanced Power-Up Generation Mechanism:**  
   - Added `ActorLevelUp` and `HeartItem` as collectible power-ups to boost player firepower and restore health, respectively.
   - Controlled the frequency of power-up generation through probability settings to maintain game balance and rarity.

4. **Sound and Audio Management Optimization:**  
   - Utilized `SoundComponent` to manage background music and specific event sound effects, such as Boss defeats and power-up pickups.
   - Ensured synchronization between sound effects and game states to enhance player immersion.

5. **Enhanced Level Objectives and UI Display:**  
   - Added an `objectiveLabel` to display current level objectives, aiding players in understanding game tasks.
   - Implemented dynamic updates to level objective texts, providing real-time feedback as the game progresses.

6. **Pause and Settings Menu Integration:**  
   - Added a pause button to allow players to access the settings menu during gameplay.
   - Implemented game pause and resume logic, managing game timelines and sound effects accordingly.

7. **Resource Cleanup and Management Optimization:**  
   - Implemented a `cleanUp()` method to ensure proper resource release upon level completion, preventing memory leaks.
   - Removed all animations, entities, and UI elements to ensure smooth transitions between levels.

**Change Impact and Significance:**
- Introduced Boss battles and power-up systems to significantly enhance game depth and challenge, enriching player experience.
- Optimized animations and audio management to improve visual and auditory effects, boosting overall immersion.
- Enhanced victory and defeat logic to ensure seamless game flow and comprehensive playability.

## Unexpected Issues and Solutions

### Issue: Shield Refreshing After Game Over

- **Problem**: After the player dies and the `GameOver` screen is displayed, the boss in Level Two continues to refresh and display shields.
- **Solution**:
  - **Implemented**: Added a method `stopShieldTimeline()` in the `Boss` class to allow external control over the shield refreshing `Timeline`.
  - **Modified**: Updated `LevelTwo`'s `checkIfGameOver` method to call `boss.stopShieldTimeline()` when the player dies.
  - **Outcome**: Ensures that once the player is dead and `GameOver` is triggered, the boss no longer refreshes or displays shields, preventing unwanted animations and resource usage post-game termination.

### Issue: LevelUp Animation Not Following Player

- **Problem**: The LevelUp animation remained static on the screen when the player moved, breaking immersion and visual consistency.
- **Solution**:
  - **Implemented**: Modified the `AnimationComponent` to include the `playLevelUpRelative` method, which attaches the LevelUp animation as a child node to the player's `Group`.
  - **Modified**: Updated the `UserPlane` class to use the new `playLevelUpRelative` method when a power-up is collected, ensuring the animation follows the player's movement.
  - **Outcome**: LevelUp animations now dynamically follow the player's position, maintaining visual consistency even as the player moves across the screen.

### Issue: Main Menu Interface Offset (Scaling Issue on Windows with 125% DPI)

- **Problem**: When returning to the main menu after playing a level, the main menu interface would sometimes appear offset or misaligned on systems with Windows scaling set to 125%. Initially, the first time loading the main menu had no issues, but subsequent returns caused the interface to shift. Also, attempts to reuse the same root node for the main menu scene triggered exceptions like `is already set as root of another scene`.
- **Solution**:
  - **Implemented**: Created a new `MainMenuParent` class similar to `LevelParent`, ensuring each main menu display uses a fresh root node and scene.
  - **Modified**: Updated the `Controller.showMainMenu()` method to instantiate a new `MainMenuParent` each time the main menu is displayed.
  - **Outcome**: Resolved the offset and scaling issues by avoiding root node reuse and ensuring consistent scene initialization, leading to a stable and properly aligned main menu interface across different DPI settings.

### Issue: Sound Overlapping and Playback

- **Problem**: Sometimes, sound effects overlap or do not play as expected.
- **Solution**:
  - **Implemented**: Modified `SoundComponent` to stop and reset media players before playing sounds.
  - **Modified**: Ensured that media players are managed properly to prevent resource leaks.
  - **Outcome**: Sound playback is now more reliable, with reduced overlapping and improved synchronization with game events.

### Issue: Control Customization Not Reflecting Immediately

- **Problem**: Changes in key bindings do not take effect until the game restarts.
- **Solution**:
  - **Implemented**: Added methods to refresh input listeners when key bindings are updated.
  - **Modified**: Ensured that the game reads the latest key bindings from the `KeyBindings` class during the game loop.
  - **Outcome**: Key binding changes now take effect immediately without needing to restart the game, enhancing user experience and control flexibility.

## Summary

The primary focus of this refactoring and enhancement was to:

1. **Reorganize Directory and Package Structure:**  
   Moved class files to more logical packages (e.g., `actors`, `projectile`, `levels`, `ui`, `components`, `interfaces`, `utils`) to improve code readability and maintainability.

2. **Componentization and Modularization:**  
   Isolated movement, health, collision, shooting, animation, and sound logic into separate component classes to reduce coupling and increase code reusability.

3. **Object Pooling and Factory Patterns:**  
   Introduced object pooling (`ObjectPool`) and factory patterns (`ObjectFactory`, `BulletFactory`) to enhance performance and reduce memory consumption.

4. **Unify and Streamline Class Responsibilities:**  
   Consolidated scattered classes (e.g., `GameOverImage`, `WinImage`, `HeartDisplay`) into corresponding `ui` packages and provided unified management strategies for `LevelView`, `MainMenu`, `SettingsPage`, etc., enhancing modularity and maintainability.

Through these changes, the project structure has become more organized, the codebase more extensible and maintainable, and the interaction between functional modules significantly reduced coupling, facilitating easier addition and modification of future features.

## License

This project is a coursework assignment for our institution. **Copying or plagiarizing any part of this project is strictly prohibited.**

- You are welcome to **view the code** to learn and understand how the game is implemented.
- Feel free to **download and play** the game for personal enjoyment.
- **Unauthorized distribution** of the code or claiming it as your own work is not allowed.