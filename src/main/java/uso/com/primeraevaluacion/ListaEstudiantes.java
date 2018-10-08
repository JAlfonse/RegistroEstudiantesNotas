package uso.com.primeraevaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import static uso.com.primeraevaluacion.Principal.Adaptador;

public class ListaEstudiantes extends AppCompatActivity {

    //Declaracion de variables
    ListView Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        Lista = findViewById(R.id.ListView);
        if(Adaptador!= null){
            Lista.setAdapter(Adaptador);
        }
    }
}
