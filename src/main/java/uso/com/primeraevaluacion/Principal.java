package uso.com.primeraevaluacion;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    //Declaracion de variables
    public static AdaptadorEstudiante Adaptador;
    ArrayList<Estudiante> ListaEstudiante;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListaEstudiante = new ArrayList<>();
        Adaptador = new AdaptadorEstudiante(this, ListaEstudiante);
        btn = findViewById(R.id.btnListaEst);
    }

    public void onClickBtnNuevoEstudiante(View v){
        Intent nuevoActivity = new Intent(Principal.this, NuevoEstudiante.class);
        startActivity(nuevoActivity);
    }

    public void onClickBtnListaEstudiantes(View v){
        Intent nuevoActivity = new Intent(Principal.this, ListaEstudiantes.class);
        startActivity(nuevoActivity);
    }
    @Override
    public void onResume()
    {
        super.onResume();
        btn.setText("LISTA ESTUDIANTES " + Adaptador.getCount());
    }
}
