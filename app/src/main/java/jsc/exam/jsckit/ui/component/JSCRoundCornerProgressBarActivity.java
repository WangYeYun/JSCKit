package jsc.exam.jsckit.ui.component;

import android.os.Bundle;
import android.support.annotation.Nullable;

import jsc.exam.jsckit.R;
import jsc.exam.jsckit.ui.BaseActivity;

public class JSCRoundCornerProgressBarActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsc_round_corner_progress_bar);
        setTitle(getClass().getSimpleName().replace("Activity", ""));
    }
}
