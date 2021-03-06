#### Version: 0.3.1
- **Added**: Scale entities tool
- **Added**: Rotate entities tool
- **Added**: It's now possible to set scene variables, added "Scene Variables" dialog
- **Added**: New command line arguments: `--project` and `--scene` for auto loading project 
- **Fixed**: Wrong entities position after opening same scene for the second time
- **Fixed**: Sprite flip Y property was ignored after reloading scene ([#103](https://github.com/kotcrab/VisEditor/issues/103))
- **Fixed**: Missing "Enter into Group" button after right clicking entities group ([#102](https://github.com/kotcrab/VisEditor/issues/102))
- **Fixed**: Exporting scenes which had used groups with string id's set ([#104](https://github.com/kotcrab/VisEditor/issues/104))
- **Fixed**: Editor crash after undoing changes made in Entity Properties dialog ([#106](https://github.com/kotcrab/VisEditor/issues/106))
- **Fixed**: Random editor crashes when working with multiple layers and groups ([#104](https://github.com/kotcrab/VisEditor/issues/104))
- **Fixed**: Fixed some key shortcuts not working on locked layers ([#109](https://github.com/kotcrab/VisEditor/issues/109))
- **Fixed**: Issues with bounding box problems after undo ([#108](https://github.com/kotcrab/VisEditor/issues/108))
- **Fixed**: Negative y origin on text when using "Auto set origin to center"  
- **Improved**: Rectangular selection is much faster when selecting many entities
- **Removed**: Optional usage analytics 

#### Version: 0.3.0
- Old project from previous versions have to be converted using project converter before loading
- Scene files are now saved using Json format
- **Improved**: It's possible to store any asset file in any directory
- **Fixed**: crash when trying to load particle with missing texture
- **Misc**: Removed 'beta' update channel
- **Misc**: Other bug fixes

#### Old changelog file:
```
[0.2.6]
-Fixed issue with unmodifiable entity properties on Entity with TextComponent or PhysicsPropertiesComponent
-Fixed issue when TextComponent color wasn't applied to text after reloading scene
-Fixed issues with entering float values in TextComponent properties fields
-Fixed crash when trying to add PhysicsPropertiesComponent to SpriterComponent
-Fixed crash when using PhysicsPropertiesComponent with entities not supporting origin
-Fixed issue when position of Point wasn't saved properly
-Fixed issue with loading texture atlas from nested directories

[0.2.5]
-Added PointComponent - can be placed on scene, for example for spawn points
-Music and Sound files can now be changed from Entity Properties
-Fixed text size was not possible to change for ttf fonts
-Fixed error when loading scene with ShaderComponent without shader set
-Added Ctrl+D for duplicating selected entities
-In scene editor, added "Move to Layer" in popup menu, for quick entity moving between layers
-Fixed groups issues
 -Grouping entities while inside group is now working properly
 -Fixed copy pasting groups

[0.2.4]
-Added Spriter support
-Added "Colors" settings
 -Changed default background and grid color
-Fixed crash after unexpectedly removing one of shader file (issue #21)
-Fixed crash after opening Select File Dialog but there isn't any available file to select
-Fixed "Auto Set Origin to Center" checkbox not updating EntityProperties UI after checking
-Fixed "Auto Adjust Origin" in PhysicsPropertiesComponent for scaled objects
-Fixed copy-paste at wrong position when using right click popup menu
-"Add Component" dialog now can be used for multiple selected entities
-Improved Twitter view

[0.2.3]
-Added VariablesComponent
-Fixed crash when moving entities group
-Fixed crash for very small grid sizes
-Fixed issue when Entity Properties dialog wasn't updated after entity remove undo
-Fixed issue when Entity Properties collapsed components panels would expand again after dragging entity
-When opening project from older version of VisEditor a project backup will be created
-Added Ctrl + E keyboard shortcut to export project
-Added snapping to grid

[0.2.2]
-Fixed crash when creating project

[0.2.1]
-Unsaved resources dialog is displayed before export
-You can hold space to pan camera
-Scene backup file is created before saving (file with '.bak' and '.firstSaveBak' extension in `vis/modules/.sceneBackup`, that can be used when saving fails)
-Added ShaderComponent
-Added PolygonComponent
-Added Box2d physics support
 -Added PhysicsPropertiesComponent
-Improved Entity Properties dialog, now allows to add custom entity components
-Added Layer settings dialog: allows to change name and coordinates system (world or screen for UI)

[0.2.0]
-First public release
```