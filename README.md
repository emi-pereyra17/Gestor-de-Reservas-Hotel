# 🏨 **Hotel Booking - Gestión de Reservas de Hotel**
Este es un proyecto de escritorio desarrollado con **Java Swing** y **EclipseLink** para la gestión de una base de datos MySQL. La aplicación permite gestionar las reservas de un hotel, creando y gestionando clientes, así como un sistema de registro y login para los usuarios que administran la aplicación (empleados del hotel). Los usuarios pueden realizar un CRUD (crear, leer, actualizar y eliminar) de reservas y visualizarlas en una tabla.

🚀 **Funcionalidades**  
- **Gestión de Reservas:** Permite crear, modificar, consultar y eliminar reservas para las habitaciones del hotel.
- **Gestión de Clientes:** Permite crear y modificar información de los clientes que realizan las reservas.
- **Registro y Login de Usuarios:** Los empleados del hotel pueden registrarse y acceder a la aplicación mediante un sistema de autenticación.
- **Visualización de Disponibilidad:** Verifica la disponibilidad de las habitaciones según las fechas de reserva.
- **Base de Datos:** Los registros de reservas, clientes y usuarios se almacenan en una base de datos MySQL, asegurando la persistencia de la información.

⚙️ **Tecnologías utilizadas**
- Java 17
- Swing (para la interfaz gráfica de usuario)
- JPA (Java Persistence API) con **EclipseLink** (para la conexión y gestión de la base de datos MySQL)
- MySQL (Base de datos local)
- Arquitectura en capas: 
  - **IGU** (Interfaz Gráfica de Usuario)
  - **Controladora** (Lógica de negocios)
  - **Persistencia** (Acceso a la base de datos)

## 🛠️ **Instalación y configuración**

1. **Clonar el repositorio**:
   Para comenzar, clona el repositorio en tu máquina local usando el siguiente comando:
   ```bash
   git clone https://github.com/emi-pereyra17/Hotel-Booking.git
   
 2. **Configurar la base de datos MySQL**:
   - Crea una base de datos llamada `hotelReservas` en MySQL (si aún no lo has hecho).
   - Configura la conexión a la base de datos en el archivo `application.properties` con los siguientes parámetros:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/hotelReservas
     spring.datasource.username=root
     spring.datasource.password=tu_contraseña
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.properties.javax.persistence.provider=org.eclipse.persistence.jpa.PersistenceProvider
     ```

## 👨‍💻 **Autor**
- **Emiliano Pereyra**
- 📧 [Email: emiacebal2012@hotmail.com](mailto:emiacebal2012@hotmail.com)
- 💼 [LinkedIn: www.linkedin.com/in/emiliano-pereyra-52164a29b](https://www.linkedin.com/in/emiliano-pereyra-52164a29b)

