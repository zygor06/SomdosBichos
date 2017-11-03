package somdosbichos.hygor.com.br.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class SomActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView ovelha;
    private ImageView macaco;
    private ImageView vaca;
    private ImageView crocodilo;
    private ImageView camelo;
    private ImageView burro;
    private ImageView rato;
    private ImageView coelho;
    private ImageView rinoceronte;
    private ImageView hipopotamo;
    private ImageView tartatura;
    private ImageView porco;
    private ImageView touro;


    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som);

        cao     = (ImageView) findViewById(R.id.imgCaoId);
        gato    = (ImageView) findViewById(R.id.imgGatoId);
        leao    = (ImageView) findViewById(R.id.imgLeaoId);
        ovelha  = (ImageView) findViewById(R.id.imgOvelhaId);
        macaco  = (ImageView) findViewById(R.id.imgMacacoId);
        vaca    = (ImageView) findViewById(R.id.imgVacaId);

        crocodilo    = (ImageView) findViewById(R.id.imgCrocodiloId);
        camelo       = (ImageView) findViewById(R.id.imgCameloId);
        burro        = (ImageView) findViewById(R.id.imgBurroId);
        rato         = (ImageView) findViewById(R.id.imgRatoId);
        coelho       = (ImageView) findViewById(R.id.imgCoelhoId);
        rinoceronte  = (ImageView) findViewById(R.id.imgRinoId);
        hipopotamo   = (ImageView) findViewById(R.id.imgHipoId);
        tartatura    = (ImageView) findViewById(R.id.imgTartarugaId);
        porco        = (ImageView) findViewById(R.id.imgPorcoId);
        touro        = (ImageView) findViewById(R.id.imgTouroId);


        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        macaco.setOnClickListener(this);
        vaca.setOnClickListener(this);
        crocodilo.setOnClickListener(this);
        camelo.setOnClickListener(this);
        burro.setOnClickListener(this);
        rato.setOnClickListener(this);
        coelho.setOnClickListener(this);
        rinoceronte.setOnClickListener(this);
        hipopotamo.setOnClickListener(this);
        tartatura.setOnClickListener(this);
        porco.setOnClickListener(this);
        touro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imgCaoId:tocarSom(R.raw.cao);break;
            case R.id.imgGatoId:tocarSom(R.raw.gato);break;
            case R.id.imgLeaoId:tocarSom(R.raw.leao);break;
            case R.id.imgOvelhaId:tocarSom(R.raw.ovelha);break;
            case R.id.imgMacacoId:tocarSom(R.raw.macaco);break;
            case R.id.imgVacaId:tocarSom(R.raw.vaca);break;
            case R.id.imgBurroId:tocarSom(R.raw.burro);break;
            case R.id.imgCameloId:tocarSom(R.raw.camelo);break;
            case R.id.imgCoelhoId:tocarSom(R.raw.coelho);break;
            case R.id.imgCrocodiloId:tocarSom(R.raw.crocodilo);break;
            case R.id.imgHipoId:tocarSom(R.raw.hipopotamo);break;
            case R.id.imgPorcoId:tocarSom(R.raw.porco);break;
            case R.id.imgRatoId:tocarSom(R.raw.rato);break;
            case R.id.imgRinoId:tocarSom(R.raw.rinoceronte);break;
            case R.id.imgTartarugaId:tocarSom(R.raw.tartaruga);break;
            case R.id.imgTouroId:tocarSom(R.raw.touro);break;
        }
    }

    public void tocarSom(int id){

        Log.i("Clicou", "Id: "+id);

        if(mp != null){
            if(mp.isPlaying()){
                mp.stop();
            }
        }

        mp = MediaPlayer.create(SomActivity.this, id);
        if(mp != null){
            mp.start();
        }
    }

    @Override
    protected void onDestroy() {
        if(mp != null){
            if(mp.isPlaying()){
                mp.release();
            }
            mp = null;
        }

        super.onDestroy();
    }
}
