package p341ge.bog.chat.presentation.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: ge.bog.chat.presentation.view.TypingAnimationView */
public final class TypingAnimationView extends LinearLayout {

    /* renamed from: f */
    public static final C13095a f38536f = new C13095a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayList f38537d;

    /* renamed from: e */
    private final Runnable f38538e = new C13096b(this);

    /* renamed from: ge.bog.chat.presentation.view.TypingAnimationView$a */
    public static final class C13095a {
        private C13095a() {
        }

        public /* synthetic */ C13095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.chat.presentation.view.TypingAnimationView$b */
    public static final class C13096b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ TypingAnimationView f38539d;

        C13096b(TypingAnimationView typingAnimationView) {
            this.f38539d = typingAnimationView;
        }

        public void run() {
            Drawable drawable = ((ImageView) C41358y.m120019i0(this.f38539d.f38537d)).getDrawable();
            Iterator it = this.f38539d.f38537d.iterator();
            while (it.hasNext()) {
                ImageView imageView = (ImageView) it.next();
                Drawable drawable2 = imageView.getDrawable();
                imageView.setImageDrawable(drawable);
                drawable = drawable2;
            }
            this.f38539d.postDelayed(this, 300);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypingAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f38537d = arrayList;
        View.inflate(context, C18589r.chat_typing_animation_layout, this);
        arrayList.add(findViewById(C18588q.dot_one));
        arrayList.add(findViewById(C18588q.dot_two));
        arrayList.add(findViewById(C18588q.dot_three));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f38538e);
        if (getVisibility() == 0) {
            postDelayed(this.f38538e, 300);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38538e);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        removeCallbacks(this.f38538e);
        if (i == 0) {
            postDelayed(this.f38538e, 300);
        }
    }
}
