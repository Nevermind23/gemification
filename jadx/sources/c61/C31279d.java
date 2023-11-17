package c61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.storythumbnail.StoryThumbnail;
import x51.C39793e;

/* renamed from: c61.d */
public final class C31279d implements C6201a {

    /* renamed from: d */
    private final StoryThumbnail f77669d;

    private C31279d(StoryThumbnail storyThumbnail) {
        this.f77669d = storyThumbnail;
    }

    /* renamed from: a */
    public static C31279d m92906a(View view) {
        if (view != null) {
            return new C31279d((StoryThumbnail) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31279d m92907d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39793e.item_story_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92906a(inflate);
    }

    /* renamed from: c */
    public StoryThumbnail mo3946b() {
        return this.f77669d;
    }
}
