package p81;

import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: p81.a */
public class C37928a {
    /* renamed from: a */
    public int mo91286a(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                if (listView.getChildCount() > 0) {
                    if (listView.getAdapter() == null) {
                        return 0;
                    }
                    if (z) {
                        View childAt = listView.getChildAt(0);
                        return (listView.getFirstVisiblePosition() * childAt.getHeight()) - childAt.getTop();
                    }
                    View childAt2 = listView.getChildAt(listView.getChildCount() - 1);
                    return ((((listView.getAdapter().getCount() - listView.getLastVisiblePosition()) - 1) * childAt2.getHeight()) + childAt2.getBottom()) - listView.getBottom();
                }
            }
            if (!(view instanceof RecyclerView)) {
                return 0;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getChildCount() <= 0) {
                return 0;
            }
            RecyclerView.C1747p layoutManager = recyclerView.getLayoutManager();
            if (recyclerView.getAdapter() == null) {
                return 0;
            }
            if (z) {
                View childAt3 = recyclerView.getChildAt(0);
                return (recyclerView.mo5358l0(childAt3) * layoutManager.mo5672d0(childAt3)) - layoutManager.mo5675g0(childAt3);
            }
            View childAt4 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            return (((recyclerView.getAdapter().getItemCount() - 1) * layoutManager.mo5672d0(childAt4)) + layoutManager.mo5668a0(childAt4)) - recyclerView.getBottom();
        } else if (z) {
            return view.getScrollY();
        } else {
            ScrollView scrollView = (ScrollView) view;
            return scrollView.getChildAt(0).getBottom() - (scrollView.getHeight() + scrollView.getScrollY());
        }
    }
}
