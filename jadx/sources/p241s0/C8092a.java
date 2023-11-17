package p241s0;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.session.C0125b;
import com.github.mikephil.charting.utils.Utils;
import he1.C41224m;
import he1.C41233s;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import p058e.C5877d;
import p202p0.C7535d;
import p202p0.C7556l;
import p202p0.C7589q;

/* renamed from: s0.a */
public abstract class C8092a implements C7556l.C7560c {

    /* renamed from: a */
    private final Context f23250a;

    /* renamed from: b */
    private final Set f23251b;

    /* renamed from: c */
    private final WeakReference f23252c = null;

    /* renamed from: d */
    private C5877d f23253d;

    /* renamed from: e */
    private ValueAnimator f23254e;

    public C8092a(Context context, C8095d dVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(dVar, "configuration");
        this.f23250a = context;
        this.f23251b = dVar.mo23270b();
        dVar.mo23269a();
    }

    /* renamed from: b */
    private final void m30630b(boolean z) {
        C41224m mVar;
        int i;
        float f;
        C5877d dVar = this.f23253d;
        if (dVar == null || (mVar = C41233s.m119492a(dVar, Boolean.TRUE)) == null) {
            C5877d dVar2 = new C5877d(this.f23250a);
            this.f23253d = dVar2;
            mVar = C41233s.m119492a(dVar2, Boolean.FALSE);
        }
        C5877d dVar3 = (C5877d) mVar.mo95675a();
        boolean booleanValue = ((Boolean) mVar.mo95676b()).booleanValue();
        if (z) {
            i = C8099f.nav_app_bar_open_drawer_description;
        } else {
            i = C8099f.nav_app_bar_navigate_up_description;
        }
        mo23267c(dVar3, i);
        if (z) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = 1.0f;
        }
        if (booleanValue) {
            float a = dVar3.mo19208a();
            ValueAnimator valueAnimator = this.f23254e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar3, "progress", new float[]{a, f});
            this.f23254e = ofFloat;
            if (ofFloat != null) {
                ofFloat.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
        }
        dVar3.setProgress(f);
    }

    /* renamed from: a */
    public void mo22147a(C7556l lVar, C7589q qVar, Bundle bundle) {
        C41536l.m120489i(lVar, "controller");
        C41536l.m120489i(qVar, "destination");
        if (!(qVar instanceof C7535d)) {
            WeakReference weakReference = this.f23252c;
            if (weakReference != null) {
                C0125b.m366a(weakReference.get());
            }
            if (this.f23252c != null) {
                lVar.mo22128e0(this);
                return;
            }
            CharSequence x = qVar.mo22215x();
            if (x != null) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(x);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (bundle == null || !bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + x + '\"');
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(String.valueOf(bundle.get(group)));
                }
                matcher.appendTail(stringBuffer);
                mo23268d(stringBuffer);
            }
            if (C8098e.m30642a(qVar, this.f23251b)) {
                mo23267c((Drawable) null, 0);
            } else {
                m30630b(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo23267c(Drawable drawable, int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo23268d(CharSequence charSequence);
}
