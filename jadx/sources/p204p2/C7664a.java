package p204p2;

import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import of1.C41880d0;
import p075f3.C6152a;
import p217q2.C7836g;
import p217q2.C7843j;

/* renamed from: p2.a */
public interface C7664a extends C6152a {

    /* renamed from: p2.a$a */
    public static abstract class C7665a {
        /* renamed from: a */
        public void mo22368a(ApolloCanceledException apolloCanceledException) {
            mo20503b(apolloCanceledException);
        }

        /* renamed from: b */
        public abstract void mo20503b(ApolloException apolloException);

        /* renamed from: c */
        public void mo22369c(ApolloHttpException apolloHttpException) {
            mo20503b(apolloHttpException);
            C41880d0 c = apolloHttpException.mo7648c();
            if (c != null) {
                c.close();
            }
        }

        /* renamed from: d */
        public void mo22370d(ApolloNetworkException apolloNetworkException) {
            mo20503b(apolloNetworkException);
        }

        /* renamed from: e */
        public void mo22371e(ApolloParseException apolloParseException) {
            mo20503b(apolloParseException);
        }

        /* renamed from: f */
        public abstract void mo20504f(C7843j jVar);

        /* renamed from: g */
        public void mo20505g(C7666b bVar) {
        }
    }

    /* renamed from: p2.a$b */
    public enum C7666b {
        SCHEDULED,
        FETCH_CACHE,
        FETCH_NETWORK,
        COMPLETED
    }

    /* renamed from: a */
    C7836g mo22366a();

    /* renamed from: b */
    void mo22367b(C7665a aVar);
}
