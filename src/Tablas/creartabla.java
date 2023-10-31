/*package Tablas;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class creartabla extends AbstractTableModel {

    private enum columnas{
        // Aqui defino todas las columnas
        Nif("NIF"),
        Name("Nombre"),
        Surname("Apellidos"),
        Age("Edad");

        // Estos son los campos de cada columna
        final String header;

        columnas(String header){this.header = header;}
    }
    private List<Student> students;

    public creartabla (List<Student> students){
        super();
        this.students = students;
    }

    @Override
    public int getRowCount(){return students.size();}

    @Override
    public int getColumnCount(){return columnas.values().length;}

    @Override
    public String getColumnName(int column){return columnas.values()[column].header;}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnas.values()[columnIndex]){
            case Name:
                return student.getName();
            case Surname:
                return student.getSurname();
            case Nif:
                return student.getNif();
            case Age:
                return student.getAge();
            default:
                throw new RuntimeException("No existe la columna "+columnIndex);
        }
    }

    public
}
*/