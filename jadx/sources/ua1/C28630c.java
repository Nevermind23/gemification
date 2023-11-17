package ua1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import com.theartofdev.edmodo.cropper.CropImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: ua1.c */
public final class C28630c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72682d;

    /* renamed from: e */
    public final CropImageView f72683e;

    /* renamed from: f */
    public final ProgressBar f72684f;

    /* renamed from: g */
    public final FrameLayout f72685g;

    /* renamed from: h */
    public final ConstraintLayout f72686h;

    /* renamed from: i */
    public final Button f72687i;

    private C28630c(ConstraintLayout constraintLayout, CropImageView cropImageView, ProgressBar progressBar, FrameLayout frameLayout, ConstraintLayout constraintLayout2, Button button) {
        this.f72682d = constraintLayout;
        this.f72683e = cropImageView;
        this.f72684f = progressBar;
        this.f72685g = frameLayout;
        this.f72686h = constraintLayout2;
        this.f72687i = button;
    }

    /* renamed from: a */
    public static C28630c m87617a(View view) {
        int i = C10216u.crop_image;
        CropImageView cropImageView = (CropImageView) C6202b.m24689a(view, i);
        if (cropImageView != null) {
            i = C10216u.f28314Z1;
            ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
            if (progressBar != null) {
                i = C10216u.f28316a2;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C10216u.f28341u2;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        return new C28630c(constraintLayout, cropImageView, progressBar, frameLayout, constraintLayout, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72682d;
    }
}
