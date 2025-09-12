 # RestaurantMenus
-Abstract Factory Application 
+
+Aplicación de consola en Java que demuestra el patrón de diseño **Abstract Factory** para la creación de menús de restaurante. Permite al usuario elegir entre diferentes tipos de menú (gourmet, vegetariano y saludable) y seleccionar sus platos, bebidas y postres dentro del menú elegido.
+
+## Estructura del proyecto
+
+- **MenuProducts.java**: define las interfaces `InitialDish`, `MainDish`, `Drink` y `Dessert` que representan los distintos tipos de productos de un menú.
+- **GenericDish.java**: implementación genérica de los cuatro tipos de productos. Recibe una descripción y la imprime cuando se añade al pedido.
+- **MenuFactory.java**: interfaz del patrón Abstract Factory. Declara los métodos para crear las listas de productos de cada categoría.
+- **MenuGourmetFactory.java**, **MenuVegetarianFactory.java**, **MenuHealthyFactory.java**: fábricas concretas que devuelven listas de `GenericDish` con las opciones de cada menú.
+- **RestauranteApp.java**: clase con el método `main`. Presenta un menú interactivo en consola para que el usuario elija el tipo de menú y seleccione una opción para cada categoría.
+
+## Ejecución
+
+1. Compilar todas las clases:
+
+   ```bash
+   javac *.java
+   ```
+
+2. Ejecutar la aplicación:
+
+   ```bash
+   java RestauranteApp
+   ```
+
+3. Seguir las instrucciones en la consola para armar el pedido.
+
+## Extensión
+
+Para agregar nuevos tipos de menú, crea una clase que implemente `MenuFactory` y proporcione las listas de productos correspondientes.
+
 
EOF
)
