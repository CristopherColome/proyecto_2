# Proyecto

### Requisitos

- Java 1.8 o mayor
- Maven
- Mysql

### Configuracion:

- Modificar archivo 'src/main/resources/META-INF/persistence.xml' para la conexion a la base de datos        
```
  - IP = 127.0.0.1
  - USUARIO = root
  - PASSWORD = root
  <property name="javax.persistence.jdbc.url" value="jdbc:mysql://{{IP}}:3306/bodega?zeroDateTimeBehavior=CONVERT_TO_NULL"/>
  <property name="javax.persistence.jdbc.user" value="{{USUARIO}}"/>
  <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
  <property name="javax.persistence.jdbc.password" value="{{PASSWORD}}"/>

```
- Cargar base de datos: src/main/resources/sql/bodega.sql
        
Compilar y correr la aplicacion

```
mvn clean install
```

USAURIO: admin , PASSWORD: admin
