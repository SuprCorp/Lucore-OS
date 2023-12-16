## How to Create Extension Packs

**Introduction:**
_Lucore is very versatile, so it's got to include custom extension creating._
_This tutorial will show you how to create your very own extension packs for Lucore!_

### Step 1

To start creating your own extension pack, you will need some knowledge of Lucore's very own, easy-to-use programming language, CoreLight.

_If you already have knowledge of CoreLight, you can close this tutourial._

**Opening the IDE:**
You can open the IDE (Integrated Development Environment) by launching the _Extension pack's_ app in the start menu. Locate and press '**+** Create', and then you have opened the IDE. Keep it open; do not minimize it!

# CoreLight Extension Development Guide

## Introduction

Welcome to CoreLight Extension Development! This guide is designed to help you create a simple extension using CoreLight IDE. Whether you're a beginner or an experienced developer, these steps will assist you in harnessing CoreLight's powerful extension capabilities.

## Displaying Text

To display text, you can use the following code:

[
display.text("Hello, CoreLight!")
]

## Containers
Containers are used to create extension packs and more. Here's a simple container example:

[
container displayText(){display.text("Hello, CoreLight!")}
]

## Executor Service
The executor service manages events on the home screen/desktop. To open Lucore Ion when pressing the version label, use the following code:

[
executorservice desktop ion-assistant displayText
]

## Creating an Extension
Open CoreLight IDE and use the following code:

[
container displayText(){display.text("Hello, CoreLight!")}
executorservice desktop ion-assistant displayText
]

## Finishing up

Press 'CTRL + S' to save your extension.

Name your extension when prompted.

## Testing and Installation
Close all open apps in Lucore OS.

Navigate to and press 'More.'

Press 'Force exit.' (If data can't be saved, resolve by right-clicking the background image and pressing 'Force exit.')

**Congratulations! You've created your first CoreLight extension. Feel free to explore and enhance it further.**
**_Happy coding with CoreLight!_**
