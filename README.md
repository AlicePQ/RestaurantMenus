# RestaurantMenus
Abstract Factory Application 
# 🍽️ Restaurante con Patrón Abstract Factory

Este proyecto es un ejemplo académico en **Java** que implementa el **patrón de diseño Abstract Factory** para simular el sistema de pedidos de un restaurante.  

El restaurante ofrece **tres tipos de menús**:
- 🥩 **Gourmet**  
- 🥗 **Vegetariano**  
- 🥦 **Saludable**  

Cada menú contiene **4 categorías de platos**:
1. Entrada  
2. Plato principal  
3. Bebida  
4. Postre  

El usuario puede elegir un menú completo y, dentro de él, seleccionar **una opción específica por cada categoría**.

---

## 📂 Estructura del proyecto

/src
│
├── MenuProducts.java # Interfaces para los tipos de platos
├── GenericDish.java # Clase genérica para representar un plato
├── MenuFactory.java # Fábrica abstracta
├── MenuGourmetFactory.java # Fábrica concreta (Gourmet)
├── MenuVegetarianFactory.java # Fábrica concreta (Vegetariana)
├── MenuHealthyFactory.java # Fábrica concreta (Saludable)
└── RestauranteApp.java # Clase principal (main)

---

## ⚙️ Funcionamiento del código

1. **Selección del tipo de menú**  
   Al iniciar, el programa solicita al usuario elegir entre los 3 tipos de menús:
   1. Gourmet
   2. Vegetariano
   3. Saludable

   
2. **Opciones disponibles en cada categoría**  
Según el menú seleccionado, el sistema muestra una lista de **opciones de entrada, plato principal, bebida y postre**.  
Ejemplo para menú Gourmet → Entradas:  

1. Carpaccio de salmón
2. Bruschetta con tomate y albahaca
3. Sopa de champiñones


3. **Elección del usuario**  
El usuario selecciona un número y el programa guarda esa opción como parte de su pedido. Este proceso se repite para las cuatro categorías.

4. **Pedido final**  
Una vez completada la selección, el sistema muestra un resumen del pedido:

✅ Su pedido final incluye:
Entrada Gourmet: Carpaccio de salmón
Plato Gourmet: Filete mignon con salsa de vino tinto
Bebida Gourmet: Vino tinto reserva
Postre Gourmet: Soufflé de chocolate


---

## 🧩 Patrón de diseño aplicado

Se aplica **Abstract Factory** porque:
- Existe una **fábrica abstracta (`MenuFactory`)** que define la creación de los distintos productos (entrada, plato, bebida, postre).  
- Existen **fábricas concretas** (`MenuGourmetFactory`, `MenuVegetarianFactory`, `MenuHealthyFactory`) que devuelven familias de productos específicos según el tipo de menú.  
- Se usa una **clase genérica (`GenericDish`)** para representar cualquier tipo de plato, reduciendo el número de clases sin perder la estructura del patrón.  

---

## ▶️ Ejecución

1. Compilar todos los archivos Java:
```bash
javac *.java

2. Ejecutar el programa:

java RestauranteApp


Funcionalidades destacadas

✅ Interacción con el usuario por consola.

✅ Tres menús distintos (Gourmet, Vegetariano, Saludable).

✅ Varias opciones por categoría de plato.

✅ Aplicación del patrón Abstract Factory de forma clara y compacta.

✅ Código modular y fácil de extender (se pueden agregar nuevos menús fácilmente).