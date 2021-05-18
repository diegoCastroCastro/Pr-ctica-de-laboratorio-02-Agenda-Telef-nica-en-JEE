# Práctica de laboratorio 02 Agenda Telefónica en JEE


**1.  Objetivo Alcanzado**

- Implementar los recursos de programación JEE revisados en clase en el proyecto.
- Desarrollar un programa utilizando entornos de desarrollo actuales.
- Configuración de Filtros para la seguridad.

**2. Diagrama de Clases**

![diagrama](https://user-images.githubusercontent.com/49213231/118613793-b2e74880-b784-11eb-9dea-009f4a9ad65b.png)

**3. Requerimientos funcionales.**

- Los usuarios pueden registrarse en la aplicación a través de un formulario de creación de cuentas.

**Interfaz para el usuario:** En el formulario de registro el usuario ingresara toda la información necesaria, cada campo esta validado para su correcto funcionamiento.

![interfaz1](https://user-images.githubusercontent.com/49213231/118614609-90a1fa80-b785-11eb-98dc-f06ed968d079.png)

![interfaz2](https://user-images.githubusercontent.com/49213231/118614630-95ff4500-b785-11eb-82be-ac1a3452ef62.png)

**Controlador: CrearUsuarioController**
Esta clase de tipo Servlet nos permite interactuar con el FormularioRegistro.jsp para registro de la persona en la base de datos.

![cont1](https://user-images.githubusercontent.com/49213231/118614864-cba42e00-b785-11eb-8151-423b39425016.png)

**3. Un usuario puede iniciar sesión usando su correo y contraseña.**

Si el usuario ya tiene cuenta por acceder a través del siguiente formulario.

![sig](https://user-images.githubusercontent.com/49213231/118615030-eecedd80-b785-11eb-9d68-36d7e5b3c721.png)


Una vez ingresado a su cuenta personal el usuario podrá registrar, modificar, eliminar, buscar y listar sus teléfonos con los siguientes formularios.

Ingresamos a la opción teléfonos.

![telefonos](https://user-images.githubusercontent.com/49213231/118615130-0e660600-b786-11eb-94bc-95c066a1d884.png)

 Visualizamos el CRUD para los teléfonos 

![t1](https://user-images.githubusercontent.com/49213231/118615263-2b9ad480-b786-11eb-9a5c-7682bd6a7421.png)

Listar los números de teléfono de un usuario usando su número de cedula o correo electrónico.

![resul](https://user-images.githubusercontent.com/49213231/118615370-48370c80-b786-11eb-9c4b-c9934692908f.png)

Podrá llamar o enviar un correo electrónico desde el sistema usando aplicaciones externas.

![c1](https://user-images.githubusercontent.com/49213231/118615488-67359e80-b786-11eb-82d6-08f4d193dd1e.png)

![c2](https://user-images.githubusercontent.com/49213231/118615503-6bfa5280-b786-11eb-9eab-4917c373ebbe.png)

4. 	**Conexión a la BD Mysql**

ec.edu.ups.agenda.mysql.jdbc: ContextJDBC.java

La conexión se los realizar a través de esta clase la cual tiene el siguiente código.

![con1](https://user-images.githubusercontent.com/49213231/118615687-9815d380-b786-11eb-8c92-239da21d5441.png)

![con2](https://user-images.githubusercontent.com/49213231/118615720-9f3ce180-b786-11eb-8f62-015beaa7a104.png)

Con la conexión realizada y el uso del patrón DAO y demás recursos revisados en clase tendremos la información en la BD Mysql.

![BD](https://user-images.githubusercontent.com/49213231/118615790-b2e84800-b786-11eb-88be-b3a43012f1cd.png)

**5. Filtros**


**6. Conclusiones**
