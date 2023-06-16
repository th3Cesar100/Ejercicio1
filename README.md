# Ejercicio1
es una practica-ejercicio 1 usuario hobbie

# Considera
Crear una dos tables en oracle


* CREATE TABLE cl_usuario(
id_usuario NUMBER PRIMARY KEY,
nombre VARCHAR2(50),
fecha_nacimiento DATE,
correo_electronico VARCHAR2(50),
sexo VARCHAR2(1))


* CREATE TABLE cl_hobbie(
id_hobbie NUMBER PRIMARY KEY,
nombre VARCHAR2(50),
id_usuario NUMBER,
FOREIGN KEY (id_usuario) REFERENCES cl_usuario(id_usuario)
)


# Conexion BD
### Usa tus credenciales adecuadas

1. spring.datasource.url = jdbc:oracle:thin:@localhost:1521:xe

2. spring.datasource.username = 

3. spring.datasource.password = 