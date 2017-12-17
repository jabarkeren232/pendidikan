package com.example.win7.belajarbindoxi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetailMateri extends AppCompatActivity {
    public static String KEY_ITEM = "List Materi";
    private TextView txtTittle2;
    private TextView txtJudul2;
    private TextView txtIsi3;
    private TextView txtIsi4;
    private ImageView imgDetail;
    private ModelMateri item;
    private Button copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi);
        getSupportActionBar().setTitle("Isi Materi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtTittle2 = (TextView)findViewById(R.id.txt_tittle2);
        txtJudul2 = (TextView)findViewById(R.id.txt_judul2);
        txtIsi3 = (TextView)findViewById(R.id.txt_isi3);
        txtIsi4 = (TextView)findViewById(R.id.txt_isi4);
        imgDetail = (ImageView)findViewById(R.id.img_detail);
        copy =(Button)findViewById(R.id.copy);
        item = (ModelMateri) getIntent().getSerializableExtra(KEY_ITEM);

        txtTittle2.setText(Html.fromHtml(item.getTittle()));
        txtJudul2.setText(Html.fromHtml(item.getJudul()));
        txtIsi3.setText(Html.fromHtml(item.getIsi()));
        txtIsi4.setText(Html.fromHtml(item.getIsi2()));

        Picasso.with(DetailMateri.this).load(item.getImage()).into(imgDetail);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager)
                        getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple Text",txtTittle2.getText()+""+txtJudul2.getText()+""+txtIsi3.getText()+""+txtIsi4.getText());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(),"Copied to Clipboard",Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_detail_materi, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if(id == R.id.action_share){
            share();
            return true;
        }
        if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    private void share(){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, item.getTittle()+""+item.getJudul()+""+item.getIsi()+""+item.getIsi2());
        sendIntent.putExtra(Intent.EXTRA_TITLE, "Materi B.indo");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
