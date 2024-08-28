5) Los verbos expuestos en la lógica del controlador son:
GET:
    este se usa para solicitar datos de un servidor.
POST:
    envia datos al servidor para crear un nuevo recurso.
DELETE:
    elimina un recurso del servidor.
PATCH:
    Aplica modificaciones parciales a un recurso (actuatualizar un campo en concreto).
PUT:
    Actualiza un recurso existente (completo) o crea uno nuevo si no existe.
HEAD:
    Similar a GET, pero esto solo solicita los encabezados de la respuesta, sin el cuerpo, esto para
    verificar si el recurso existe o para obtener metadatos.

8) Anotaciones
@RestController:
    Indica que la clase es un controlador donde cada método devuelve un objeto de dominio en lugar de una
    vista. Essta es la combinación de @Controller y @ResponseBody.

@RequestMapping("item"):
    Mapea las solicitudes HTTP a métodos específicos de la clase controladora.
    Todas las solicitudes que comiencen con “item” serán manejadas por esa clase o método.

@Autowired:
    Permite la inyección automática de dependencias. Marca un constructor, campo o método como
    candidato para la inyección de Spring.

10)
que hace el método que se encuentra en esta clase con el nombre de GroceryItem?
    El método toString() en la clase GroceryItem sobrescribe el método toString() de la clase Object.
    Este método proporciona una representación en forma de cadena del objeto GroceryItem,
    lo cual es útil para depuración y registro.

para que sirve la etiqueta @Override?
    se utiliza para indicar que un método está sobrescribiendo un método de una superclase.
    En este caso, toString() está sobrescribiendo el método toString() de la clase Object. Usar @Override

* Clase del paquete model
* falta una anotacion -> @Documents