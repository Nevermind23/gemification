package l61;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.C41549y;
import l61.C37083f;
import m61.C37231c;
import p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel;

/* renamed from: l61.c */
public final /* synthetic */ class C37080c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C37231c f89243d;

    /* renamed from: e */
    public final /* synthetic */ StoryDetailsUiModel f89244e;

    /* renamed from: f */
    public final /* synthetic */ C41549y f89245f;

    /* renamed from: g */
    public final /* synthetic */ C37231c f89246g;

    public /* synthetic */ C37080c(C37231c cVar, StoryDetailsUiModel storyDetailsUiModel, C41549y yVar, C37231c cVar2) {
        this.f89243d = cVar;
        this.f89244e = storyDetailsUiModel;
        this.f89245f = yVar;
        this.f89246g = cVar2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return C37083f.C37084a.m109626q(this.f89243d, this.f89244e, this.f89245f, this.f89246g, view, motionEvent);
    }
}
