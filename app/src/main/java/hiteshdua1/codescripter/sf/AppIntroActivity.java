package hiteshdua1.codescripter.sf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

import hiteshdua1.codescripter.sf.Fragments.fragment_intro;

public class AppIntroActivity extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(fragment_intro.newInstance(R.layout.intro));
        addSlide(fragment_intro.newInstance(R.layout.intro2));
        addSlide(fragment_intro.newInstance(R.layout.intro3));
        addSlide(fragment_intro.newInstance(R.layout.intro4));

        setFadeAnimation();
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}