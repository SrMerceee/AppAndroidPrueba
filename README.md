# AppAndroidPrueba
Prueba Android 17/10/2025
Version usada: Narwhal (2025.1.4)

Este proyecto consiste en el desarrollo de una aplicación móvil Android que utiliza intents implícitos y explícitos para realizar diversas acciones dentro y fuera de la app. Su propósito principal es demostrar el uso práctico de los Intents como medio de comunicación entre componentes y como herramienta para acceder a funciones nativas del dispositivo.

La aplicación permite al usuario abrir el marcador telefónico, consultar contactos, acceder a Google Maps, configurar opciones del sistema como Wi-Fi o Bluetooth, y abrir un sitio web, todo desde una interfaz sencilla e intuitiva. Además, se implementan eventos explícitos para gestionar las interacciones internas entre pantallas, garantizando una navegación fluida y controlada. Este proyecto busca reforzar el aprendizaje en el uso de componentes básicos de Android Studio, la gestión del ciclo de vida de actividades y la integración con servicios del sistema, combinando funcionalidad, diseño y comprensión del entorno de desarrollo móvil.


⭐ Intents Explicitos: 
1) Detalle Activity: Mostrar algun dato utilizando el codigo "putExtra"
2) Config Activity: Simular una pestaña de ajustes del sistema y utilizando un Usa Toolbar como boton de “Atrás”
3) Abrir acitivity con alguna  transición, utilizando el codigo: "overridePendingTransition"

⭐ Intents Implícitos:
1) Ubicacion en Google maps: Opcion que abrira alguna ubicacion utilizando el codigo "geo:lat,lng?q=texto"
2) Pagina web: Opcion que abrira alguna pagina web espeficifa utilizando el codigo: "ACTION_VIEW con https:// "
3) Llamar: Opcion que abrira el pad numerico utilizando el codigo "ACTION_DIAL con tel:"
4) Wifi: Opcion que abrira las configuraciones wifi del dispositivo, utilizando el codigo: "Settings.ACTION_WIFI_SETTINGS"
5) Contactos: Opcion que abrira los contactos del dispositivo utilizando el codigo: "Intent.ACTION_PICK con ContactsContract.Contacts.CONTENT_URI"





---- Gifts con el funcionamiento de los Intents implementados ----

Intents Explicitos:
1) Boton Detalle ✅
   
![BotonDetalle](https://github.com/user-attachments/assets/10741762-53e1-45c2-81fa-9b86e2fe69b9)

2-3) (Boton Configuracion + Transicion) ✅

![BotonConfig](https://github.com/user-attachments/assets/85835cf7-9fc0-4269-8219-a1ef8c02f833)
   
Intents Implícitos:
1) (Boton Ubicacion) ✅

![BotonUbicacion](https://github.com/user-attachments/assets/5bb33be5-57a6-4a62-802e-d69a5d4fcf81)

2) (Boton Web) ✅
   
![BotonWeb](https://github.com/user-attachments/assets/c89c4cc2-1890-4d7d-b39b-90af8be9ad41)

3) (Boton Llamar) ✅

![BotonLlamar](https://github.com/user-attachments/assets/7158b03e-4c55-4a0c-92c2-ce59ce7d517f)

4) (Boton Wifi) ✅
   
![BotonWifi](https://github.com/user-attachments/assets/325df563-4319-4a9f-8030-a61ef0621020)

5) (Boton Contactos) ✅

![BotonContacto](https://github.com/user-attachments/assets/dc2f1fe8-0cad-43be-a950-3768a4c133dd)






