package baway.com.rikao0908;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (TextView) findViewById(R.id.tv);
        Animator  animator= AnimatorInflater.loadAnimator(this,R.anim.myanim);
        animator.setTarget(view);
        animator.start();
    }
}
