package co.unicauca.microkernel.client.gestionTabla;

import static co.unicauca.microkernel.client.gestionTabla.StructHistorialPedidos.*;
import co.unicauca.microkernel.common.entities.HistorialPed;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_OFF;
import javax.swing.table.DefaultTableModel;

/**
 * Tabla de historial de pedidos
 * @author Edynson, Jhonfer, Mateo, Camilo, James
 */
public class TablaHistorialPed {
    public void ver_tabla(JTable tabla, List<HistorialPed> historial) {
        tabla.setDefaultRenderer(Object.class, new Render());
        //lista de titulos
        var titulosList = new ArrayList<String>();     
        titulosList.add("ID");
        titulosList.add("NOMBRE");
        titulosList.add("FECHA CREADO");
        titulosList.add("FECHA PAGADO");
        titulosList.add(" ");
        //copiar titulos
        var titulos = new String[titulosList.size()];
        for (var i = 0; i < titulos.length; i++) {
            titulos[i] = titulosList.get(i);
        }
        var data =obtenerMatrizDatos(titulosList,historial);
        DefaultTableModel d = new DefaultTableModel(data, titulos)  {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setAutoResizeMode(AUTO_RESIZE_OFF);
        tabla.setModel(d);
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList, List<HistorialPed> historial) {
        /*se crea la matriz donde las filas son dinamicas pues corresponde
		 * a todos los usuarios, mientras que las columnas son estaticas
		 * correspondiendo a las columnas definidas por defecto
         */
        var tamaño = titulosList.size();
        Object[][] informacion = null;
        //se asignan las plabras clave para que en la clase GestionCeldas se use para asignar el icono correspondiente
        try {
            informacion=new Object[historial.size()][tamaño];
            for (var x = 0; x < informacion.length; x++) {
                var btnVisualizar = new JButton("Visualizar");
                btnVisualizar.setName("Visualizar");
                //btnAgregar.setSize(new Dimension (100,50));
                informacion[x][ID] = historial.get(x).getIdPed() + "";
                informacion[x][NOMBRE] = historial.get(x).getNombre() + "";
                informacion[x][FECHA_CREADO] = historial.get(x).getFechaCreado() + "";
                informacion[x][FECHA_PAGADO] = historial.get(x).getFechaPagado() + "";
                informacion[x][VISUALIZAR] = btnVisualizar;
            }
        } catch (Exception e) {
            System.out.println("Error al crear la tabla: "+e.getMessage());
        }
        return informacion;
    }
}
