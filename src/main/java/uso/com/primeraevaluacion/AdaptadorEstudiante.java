package uso.com.primeraevaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante> {
    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Estudiante> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Estudiante e = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);
        }
        TextView lblNumero = convertView.findViewById(R.id.idEstudiante);
        lblNumero.setText((position+1)+"");

        TextView lblNombre = convertView.findViewById(R.id.NombreEstudiante);
        lblNombre.setText(e.Nombre);

        TextView lblCodigo = convertView.findViewById(R.id.CodigoEstudiante);
        lblCodigo.setText(e.Codigo);

        TextView lblNota = convertView.findViewById(R.id.NotaEstudiante);
        DecimalFormat df = new DecimalFormat("#.00");
        lblNota.setText(e.Materia + " " + df.format(e.Promedio));

        return convertView;
    }
}
