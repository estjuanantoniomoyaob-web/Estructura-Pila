## Cómo ejecutar el proyecto Spring Boot (CMD / Terminal)

1. Abre la consola en la raíz de la carpeta del proyecto.
2. Ejecuta el siguiente comando según tu sistema operativo:

     ```cmd
     mvnw spring-boot:run
     ```

3. Una vez que veas en la consola el mensaje `Started ... Application in X seconds`, la aplicación estará activa y disponible en `http://localhost:8080`.
---

## Ejemplos de Uso

* **Insertar:** `http://localhost:8080/api/v1/insertar?x=Hola`
* `http://localhost:8080/api/v1/insertar?x=Mundo`
* **Ver Pila:** `http://localhost:8080/api/v1/ver`
* **Obtener Tamaño:** `http://localhost:8080/api/v1/tamanyo`
* **Eliminar:** `http://localhost:8080/api/v1/eliminar`
