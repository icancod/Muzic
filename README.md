# 🎵 Muzic – Android Music Player App

A simple yet modern Android music player built using **Kotlin and Jetpack Compose**.  
This app lets you **search, explore, and play songs instantly** using the iTunes API.

It focuses on clean UI, smooth interactions, and real-time data instead of static content.

---

## 🚀 Features

- 🔍 Search songs by **artist name or track**
- 🎧 Play song **previews instantly**
- 📱 Browse songs in a **grid layout**
- ➕ Add songs to a **playlist**
- 🔄 Refresh to discover **new music**
- ⏭ Navigate with **next / previous controls**
- 🎵 Auto-play next song from playlist

---

## 🧠 How it works

The app follows a simple **MVVM architecture**:
UI (Jetpack Compose)
↓
ViewModel (state & logic)
↓
Retrofit (API calls)
↓
iTunes API

- Songs are fetched from the iTunes API
- Data is managed inside the ViewModel
- UI updates automatically using Compose state
- Audio previews are played using MediaPlayer

---

## 🛠 Tech Stack

- **Kotlin** – Core programming language  
- **Jetpack Compose** – UI development  
- **Retrofit** – API calls  
- **Gson** – JSON parsing  
- **Coil** – Image loading  
- **MediaPlayer** – Audio playback  

---

## 📱 Screens
<p align="center">
  <img src="https://github.com/user-attachments/assets/2289aea2-073e-4fbb-9d01-5b24a614c7f2" width="250"/>
  <img src="https://github.com/user-attachments/assets/3bbf5ace-3512-41a9-a8ff-e12929c45ca5" width="250"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/f6e06bc2-185c-4388-9d76-5af027493cb4" width="250" />
  <img src="https://github.com/user-attachments/assets/bf09b9d1-e307-4977-a867-639ee6eb8e3d" width="250"/>
</p>


## 🎯 Why I built this
- This project was built to:
- Learn Jetpack Compose deeply
- Understand MVVM architecture in real apps
- Work with real-world APIs
- Implement media playback in Android

## ⚠️ Note
**This app uses the iTunes API, which provides only 30-second previews of songs due to licensing restrictions.**

