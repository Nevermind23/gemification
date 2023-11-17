package p341ge.bog.mobilebank.shared2.network;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared2.network.NetworkException */
public abstract class NetworkException extends IOException {

    /* renamed from: ge.bog.mobilebank.shared2.network.NetworkException$NoInternetException */
    public static final class NoInternetException extends NetworkException {

        /* renamed from: d */
        public static final NoInternetException f83826d = new NoInternetException();

        private NoInternetException() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.network.NetworkException$NotConnectedToNetwork */
    public static final class NotConnectedToNetwork extends NetworkException {

        /* renamed from: d */
        public static final NotConnectedToNetwork f83827d = new NotConnectedToNetwork();

        private NotConnectedToNetwork() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.network.NetworkException$PostLogoutSessionExpiredException */
    public static final class PostLogoutSessionExpiredException extends NetworkException {

        /* renamed from: d */
        public static final PostLogoutSessionExpiredException f83828d = new PostLogoutSessionExpiredException();

        private PostLogoutSessionExpiredException() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.network.NetworkException$ServerUnderMaintenanceException */
    public static final class ServerUnderMaintenanceException extends NetworkException {

        /* renamed from: d */
        public static final ServerUnderMaintenanceException f83829d = new ServerUnderMaintenanceException();

        private ServerUnderMaintenanceException() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared2.network.NetworkException$SessionExpiredException */
    public static final class SessionExpiredException extends NetworkException {

        /* renamed from: d */
        public static final SessionExpiredException f83830d = new SessionExpiredException();

        private SessionExpiredException() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ NetworkException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkException() {
    }
}
