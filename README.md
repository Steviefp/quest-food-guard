# QuestEat Plugin

## Overview

**QuestEat** is a RuneLite plugin designed to prevent players from accidentally eating specific food items that are required for quests. Some quest foods have important uses beyond just being edible — eating them by mistake can break or hinder quest progression. This plugin blocks the "eat" action on these critical quest foods, helping players avoid costly mistakes.

## Features

- Automatically blocks eating of designated quest food items.
- Prevents both left-click and menu "Eat" actions on these items by removing the eat option completely.
- Lightweight with no configuration required.
- Helps safeguard quest progression by protecting key items.

## How It Works

The plugin listens for menu and item interaction events. When a player tries to eat a food item flagged as a quest item, the plugin intercepts and cancels the action, effectively preventing the consumption.

## Supported Items

Currently blocked items include (example list):

- Tomato
- Banana
- Chocolate Bar
- Chocolaty Milk
- Cheese
- Orange slices
- Pirate Pete Fish Cake (RFD)
- Cooked Jubbly Meat (RFD)
- Cooked Stuffed Snake (RFD)
- Gout Touber

*Note: The list can be expanded or customized by modifying the plugin source code.*



## Contributing

Feel free to submit pull requests for adding more quest foods or improving the plugin!

---

*Developed by [Steven Price]*

