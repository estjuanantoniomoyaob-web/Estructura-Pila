# Estructura de Datos: Pila Dinámica en Spring Boot

Este proyecto es una implementación de una **Pila (Stack)** dinámica basada en nodos utilizando **Java** y **Spring Boot**. La estructura permite gestionar datos en memoria mediante una API REST.

---

## Endpoints de la API

La API está disponible en la ruta base `/api/v1`:

| Método | Endpoint | Descripción | Parámetros |
| :--- | :--- | :--- | :--- |
| **GET** | `/api/v1/insertar` | Agrega un nuevo elemento al tope de la pila | `x` (String) |
| **GET** | `/api/v1/ver` | Muestra todos los elementos actuales de la pila | Ninguno |
| **GET** | `/api/v1/tamanyo` | Devuelve la cantidad de elementos en la pila | Ninguno |
| **GET** | `/api/v1/eliminar` | Desapila y remueve el elemento superior | Ninguno |

---

## Tecnologías Utilizadas

* **Lenguaje:** Java
* **Framework:** Spring Boot (Spring Web)
* **Estructura de Datos:** Pila dinámica implementada con punteros a Nodos (`Nodo<T>`)

---

## Ejemplos de Uso

* **Insertar:** `http://localhost:8080/api/v1/insertar?x=Hola`
* `http://localhost:8080/api/v1/insertar?x=Mundo`
* **Ver Pila:** `http://localhost:8080/api/v1/ver`
* **Obtener Tamaño:** `http://localhost:8080/api/v1/tamanyo`
* **Eliminar:** `http://localhost:8080/api/v1/eliminar`
