package p376cg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.chatkit.utils.RoundedImageView;
import p653wf.C18588q;

/* renamed from: cg.g */
public final class C10428g implements C6201a {

    /* renamed from: d */
    private final FrameLayout f29658d;

    /* renamed from: e */
    public final RoundedImageView f29659e;

    /* renamed from: f */
    public final ProgressBar f29660f;

    private C10428g(FrameLayout frameLayout, RoundedImageView roundedImageView, ProgressBar progressBar) {
        this.f29658d = frameLayout;
        this.f29659e = roundedImageView;
        this.f29660f = progressBar;
    }

    /* renamed from: a */
    public static C10428g m37879a(View view) {
        int i = C18588q.messageImageAttachment;
        RoundedImageView roundedImageView = (RoundedImageView) C6202b.m24689a(view, i);
        if (roundedImageView != null) {
            i = C18588q.messageImageAttachmentProgress;
            ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
            if (progressBar != null) {
                return new C10428g((FrameLayout) view, roundedImageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f29658d;
    }
}
