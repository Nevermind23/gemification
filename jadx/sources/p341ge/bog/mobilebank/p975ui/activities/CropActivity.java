package p341ge.bog.mobilebank.p975ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.res.C0808h;
import g91.C32285a0;
import g91.C32290b1;
import g91.C32355x0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.CropView;
import p366bk.C10319h;
import p366bk.C10321j;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.CropActivity */
public class CropActivity extends C35388f2 implements View.OnClickListener {

    /* renamed from: F */
    CropView f84831F;

    /* renamed from: B2 */
    private File m103479B2() {
        File file = new File(getFilesDir() + "/images/cropped_images");
        if (!file.exists()) {
            file.mkdir();
        } else {
            file.delete();
        }
        String format = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        return new File(file.getAbsolutePath() + "/cropped_image".concat(format).concat(".jpg"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(this);
        CropView cropView = new CropView((Context) this, getIntent().getBooleanExtra("CROP_OVAL", true));
        this.f84831F = cropView;
        frameLayout.addView(cropView, new ViewGroup.LayoutParams(-1, -1));
        setContentView((View) frameLayout);
        this.f84831F.setImage(getIntent().getStringExtra("PHOTO_PATH"));
        BogButton bogButton = new BogButton(this);
        bogButton.setTextColor(-1);
        bogButton.setBackground(C32290b1.m95121k(this));
        bogButton.setTypeface(C0808h.m3033h(this, C10321j.bog_headline_medium));
        bogButton.setText(getString(C10328q.button_text_save_remember));
        frameLayout.addView(bogButton, new FrameLayout.LayoutParams(-2, C32355x0.m95516g(C10319h.bog_button_height), 1));
        bogButton.setY((float) (C32355x0.m95519j(this) - (C32355x0.m95519j(this) / 5)));
        bogButton.setGravity(17);
        int b = C32355x0.m95511b(10.0f, this);
        bogButton.setPadding(b, C32355x0.m95511b(3.0f, this), b, C32355x0.m95511b(3.0f, this));
        bogButton.setTextSize(16.0f);
        bogButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        try {
            File b = C32285a0.m95083b(m103479B2(), this.f84831F.getCropBitmap());
            Intent intent = new Intent();
            intent.putExtra("CROPPED_PATH", b.getAbsolutePath());
            setResult(-1, intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
