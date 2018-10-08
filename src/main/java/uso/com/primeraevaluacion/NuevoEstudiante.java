package uso.com.primeraevaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static uso.com.primeraevaluacion.Principal.Adaptador;

public class NuevoEstudiante extends AppCompatActivity {

    //Declaracion de variables
    EditText Nombre, Codigo, Materia, PrimerParcial, SegundoParcial, TercerParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_estudiante);

        //Inicializacion de Variables
        this.Nombre = findViewById(R.id.edtNombre);
        this.Codigo = findViewById(R.id.edtCodigo);
        this.Materia = findViewById(R.id.edtMateria);
        this.PrimerParcial = findViewById(R.id.edtPrimerParcial);
        this.SegundoParcial = findViewById(R.id.edtSegundoParcial);
        this.TercerParcial = findViewById(R.id.edtTercerParcial);
    }

    public void onClickBtnGuardar(View v){
        if(!Nombre.getText().toString().isEmpty() && !Codigo.getText().toString().isEmpty() && !Materia.getText().toString().isEmpty()
                && !PrimerParcial.getText().toString().isEmpty() && !SegundoParcial.getText().toString().isEmpty() && !TercerParcial.getText().toString().isEmpty()){
            Double N1, N2, N3;
            N1 = Double.parseDouble(PrimerParcial.getText().toString());
            N2 = Double.parseDouble(SegundoParcial.getText().toString());
            N3 = Double.parseDouble(TercerParcial.getText().toString());
            if((N1 >= 0 && N1 <= 10) && (N2 >= 0 && N2 <= 10) && (N3 >= 0 && N3 <= 10)) {
                Double Promedio = (N1 * 0.3) + (N2 * 0.3) + (N3 * 0.4);
                if (Adaptador != null) {
                    Estudiante estudiante = new Estudiante(Nombre.getText().toString(), Codigo.getText().toString(), Materia.getText().toString(), N1, N2, N3, Promedio);
                    Adaptador.add(estudiante);
                    Adaptador.notifyDataSetChanged();
                    finish();
                }
            }else{
                Toast.makeText(this, "Una nota no puede ser menor que cero o mayor que 10.", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "No pueden haber campos vacios.", Toast.LENGTH_LONG).show();
        }
    }
}
