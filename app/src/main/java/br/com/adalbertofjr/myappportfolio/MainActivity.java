package br.com.adalbertofjr.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButtons();
    }

    private void initializeButtons() {
        Button mPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        Button mStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        Button mBuildBigger = (Button) findViewById(R.id.btn_build_bigger);
        Button mMakeMaterial = (Button) findViewById(R.id.btn_make_material);
        Button mGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        Button mCapstone = (Button) findViewById(R.id.btn_capstone);

        mPopularMovies.setOnClickListener(this);
        mStockHawk.setOnClickListener(this);
        mBuildBigger.setOnClickListener(this);
        mMakeMaterial.setOnClickListener(this);
        mGoUbiquitous.setOnClickListener(this);
        mCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        showToast(((Button) view).getText().toString().toLowerCase());
    }

    private void showToast(String btnLabel) {
        String msg = String.format(getString(R.string.activity_main_msg_toast), btnLabel);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
