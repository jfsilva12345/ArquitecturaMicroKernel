package co.unicauca.microkernel.client.gestionTabla;
import static co.unicauca.microkernel.client.gestionTabla.StructCarritoEspecialesCf.*;
import co.unicauca.microkernel.common.entities.CarritoG;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_OFF;
import javax.swing.table.DefaultTableModel;

/**
 * Tabla de Carrito especiales CF
 * @author Edynson, Jhonfer, Mateo, Camilo, James
 */
public class TablaCarritoEspecialesCf {
 
    public void ver_tabla(JTable tabla, List<CarritoG> carritoE) {
        tabla.setDefaultRenderer(Object.class, new Render());
        //lista de titulos
        var titulosList = new ArrayList<String>();
        titulosList.add("ID");
        titulosList.add("NOMBRE");
        titulosList.add("PRECIO");
        titulosList.add("CANTIDAD");
        //copiar titulos
        var titulos = new String[titulosList.size()];
        for (var i = 0; i < titulos.length; i++) {
            titulos[i] = titulosList.get(i);
        }
        var data =obtenerMatrizDatos(titulosList,carritoE);
        DefaultTableModel d = new DefaultTableModel(data, titulos)  {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setAutoResizeMode(AUTO_RESIZE_OFF);
        tabla.setModel(d);
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList, List<CarritoG> carritoE) {
        /*se crea la matriz donde las filas son dinamicas pues corresponde
		 * a todos los usuarios, mientras que las columnas son estaticas
		 * correspondiendo a las columnas definidas por defecto
         */
        var tamaño = titulosList.size();
        Object[][] informacion = null;
        //se asignan las plabras clave para que en la clase GestionCeldas se use para asignar el icono correspondiente
        try {
            informacion=new Object[carritoE.size()][tamaño];
            for (var x = 0; x < informacion.length; x++) {
                informacion[x][ID] = carritoE.get(x).getIdCarrito() + "";
                informacion[x][NOMBRE] = carritoE.get(x).getNombre() + "";
                informacion[x][PRECIO] = carritoE.get(x).getPrecio() + "";
                informacion[x][CANTIDAD] = carritoE.get(x).getCantidad() + "";
            }
        } catch (Exception e) {
            System.out.println("Error al crear la tabla: "+e.getMessage());
        }
        return informacion;
    }
}
