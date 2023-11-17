package ra1;

import ba1.C10220y;
import he1.C41232r;
import he1.C41233s;
import java.util.Map;

/* renamed from: ra1.o */
public abstract class C27980o {

    /* renamed from: a */
    private static final Map f71207a = C41344r0.m119931m(C41233s.m119492a("USER_CANCELLED_VIA_HARDWARE_BUTTON", new C41232r("რეგისტრაცია შეწყდა, თავიდან ცადე", "რეგისტრაცია შეწყდა, თავიდან ცადეთ", "Registration stopped, try again")), C41233s.m119492a("NEVER_INITIALIZED", new C41232r("რაღაც შეცდომა მოხდა, დასახმარებლად მიმართე ბანკს", "რაღაც შეცდომა მოხდა, დასახმარებლად მიმართეთ ბანკს", "An error occurred, for help please contact the bank")), C41233s.m119492a("NETWORK_ISSUES", new C41232r("ინტერნეტ კავშირის პრობლემაა", "ინტერნეტ კავშირის პრობლემაა", "Network problem occurred")), C41233s.m119492a("INVALID_DEVICE_KEY_IDENTIFIER", new C41232r("რაღაც შეცდომა მოხდა, დასახმარებლად მიმართე ბანკს", "რაღაც შეცდომა მოხდა, დასახმარებლად მიმართეთ ბანკს", "An error occurred, for help please contact the bank")), C41233s.m119492a("VERSION_DEPRECATED", new C41232r("საჭიროა მობილბანკის ახალი ვერსიის გადმოწერა", "საჭიროა მობილბანკის ახალი ვერსიის გადმოწერა", "Download the latest version of mBank ")), C41233s.m119492a("GRACE_PERIOD_EXCEEDED", new C41232r("თავიდან დაიწყე რეგისტრაცია", "თავიდან დაიწყეთ რეგისტრაცია", "Start the registration again")), C41233s.m119492a("DEVICE_NOT_SUPPORTED", new C41232r("ამ მოწყობილობით ვერ გაივლი რეგისტრაციას, სხვა მოწყობილობით ცადე", "ამ მოწყობილობით ვერ გაივლით რეგისტრაციას, სხვა მოწყობილობით ცადეთ", "This device is not supported for registration, try with another")), C41233s.m119492a("DEVICE_IN_LANDSCAPE_MODE", new C41232r("მობილური ჰორიზონტალურად გიჭირავს, დაიჭირე ვერტიკალურ მდგომარეობაში", "მობილური ჰორიზონტალურად გიჭირავთ, დაიჭირეთ ვერტიკალურ მდგომარეობაში", "The device is in the landscape mode, change it to the portrait mode")), C41233s.m119492a("DEVICE_IN_REVERSE_PORTRAIT_MODE", new C41232r("ტელეფონი უკუღმა გიჭირავს, ამოატრიალე", "ტელეფონი უკუღმა გიჭირავთ, ამოატრიალეთ", "Phone is in a reversed mode, turn it over")), C41233s.m119492a("DEVICE_LOCKED_OUT", new C41232r("გამორთე აპლიკაცია და 1 საათში ცადე რეგისტრაცია", "გამორთეთ აპლიკაცია და 1 საათში ცადეთ რეგისტრაცია", "Turn off the application and try registration in 1 hour")), C41233s.m119492a("KEY_EXPIRED_OR_INVALID", new C41232r("გამორთე აპლიკაცია, თავიდან ჩართე და ახლიდან ცადე რეგისტრაცია", "გამორთეთ აპლიკაცია, თავიდან ჩართეთ და ახლიდან ცადეთ რეგისტრაცია", "Turn off the application, restart and try registration again")), C41233s.m119492a("ENCRYPTION_KEY_INVALID", new C41232r("რაღაც შეცდომა მოხდა, დასახმარებლად მიმართე ბანკს", "რაღაც შეცდომა მოხდა, დასახმარებლად მიმართეთ ბანკს", "An error occurred, for help please contact the bank")), C41233s.m119492a("UNSUCCESS", new C41232r("შენი დოკუმენტი ვერ დავასკანერეთ, თავიდან ცადე", "შენი დოკუმენტი ვერ დავასკანერეთ, თავიდან ცადეთ", "We couldn't scan your ID document, try again")), C41233s.m119492a("USER_CANCELED", new C41232r("შენი სახე ვერ დავასკანერეთ, რის გამოც რეგისტრაცია შეწყდა", "თქვენი სახე ვერ დავასკანერეთ, რის გამოც რეგისტრაცია შეწყდა", "We couldn't scan your face, try again")), C41233s.m119492a("TIMED_OUT", new C41232r("დოკუმენტის სკანირების დრო ამოიწურა", "დოკუმენტის სკანირების დრო ამოიწურა", "ID scan timeout")), C41233s.m119492a("CONTEXT_SWITCH", new C41232r("რეგისტრაციის დასასრულებლად არ გამორთო მობილბანკის აპლიკაცია", "რეგისტრაციის დასასრულებლად არ გამორთოთ მობილბანკის აპლიკაცია", "To finish registration do not close mbank application")), C41233s.m119492a("CAMERA_ERROR", new C41232r("რაღაც შეცდომა მოხდა, თავიდან ცადე", "რაღაც შეცდომა მოხდა, თავიდან ცადეთ", "An error occurred, try again")), C41233s.m119492a("NETWORK_ERROR", new C41232r("ინტერნეტ კავშირის პრობლემაა", "ინტერნეტ კავშირის პრობლემაა", "Network problem occurred")), C41233s.m119492a("LANDSCAPE_MODE_NOT_ALLOWED", new C41232r("მობილური ჰორიზონტალურად გიჭირავს, დაიჭირე ვერტიკალურ მდგომარეობაში", "მობილური ჰორიზონტალურად გიჭირავთ, დაიჭირეთ ვერტიკალურ მდგომარეობაში", "The device is in the landscape mode, change it to the portrait mode")), C41233s.m119492a("REVERSE_PORTRAIT_NOT_ALLOWED", new C41232r("მობილური ჰორიზონტალურად გიჭირავს, დაიჭირე ვერტიკალურ მდგომარეობაში", "მობილური ჰორიზონტალურად გიჭირავთ, დაიჭირეთ ვერტიკალურ მდგომარეობაში", "The device is in the landscape mode, change it to the portrait mode")), C41233s.m119492a("SKIPPED", new C41232r("შენ გამოტოვე დოკუმენტის სკანირება", "თქვენ გამოტოვეთ დოკუმენტის სკანირება", "You skipped ID document scan")), C41233s.m119492a("NON_PRODUCTION_MODE_KEY_INVALID", new C41232r("რაღაც შეცდომა მოხდა, დასახმარებლად მიმართე ბანკს", "რაღაც შეცდომა მოხდა, დასახმარებლად მიმართეთ ბანკს", "An error occurred, for help please contact the bank")), C41233s.m119492a("NON_PRODUCTION_MODE_NETWORK_REQUIRED", new C41232r("ინტერნეტ კავშირის პრობლემაა", "ინტერნეტ კავშირის პრობლემაა", "Network problem occurred")), C41233s.m119492a("GRACE_PERIOD_EXCEEDED", new C41232r("თავიდან დაიწყე რეგისტრაცია", "თავიდან დაიწყეთ რეგისტრაცია", "Start the registration again")), C41233s.m119492a("SESSION_UNSUCCESSFUL", new C41232r("რეგისტრაცია შეწყდა, თავიდან ცადე ან მიმართე ბანკს", "რეგისტრაცია შეწყდა, თავიდან ცადეთ ან მიმართეთ ბანკს", "Registration stopped, try again or contact the bank")), C41233s.m119492a("CAMERA_PERMISSION_DENIED", new C41232r("კამერაზე წვდომა არ გვაქვს, გაგვიხსენი წვდომა და გააგრძელე რეგისტრაცია", "კამერაზე წვდომა არ გვაქვს, გაგვიხსენით წვდომა და გააგრძელეთ რეგისტრაცია", "We do not have access to the camera, give us access and continue registration")), C41233s.m119492a("ENCRYPTION_KEY_INVALID", new C41232r("გამორთე აპლიკაცია, თავიდან ჩართე და ახლიდან ცადე რეგისტრაცია", "გამორთეთ აპლიკაცია, თავიდან ჩართეთ და ახლიდან ცადეთ რეგისტრაცია", "Turn off the application, restart and try registration again")), C41233s.m119492a("TIMEOUT", new C41232r("რეგისტრაციისთვის განსაზღვრული დრო ამოიწურა, თავიდან ცადე", "რეგისტრაციისთვის განსაზღვრული დრო ამოიწურა, თავიდან ცადეთ", "Registration timeout, try again")), C41233s.m119492a("CAMERA_INITIALIZATION_ISSUE", new C41232r("რაღაც შეცდომა მოხდა, თავიდან ცადე", "რაღაც შეცდომა მოხდა, თავიდან ცადეთ", "An error occurred, try again")), C41233s.m119492a("UNKNOWN_INTERNAL_ERROR", new C41232r("რაღაც შეცდომა მოხდა, თავიდან ცადე", "რაღაც შეცდომა მოხდა, თავიდან ცადეთ", "An error occurred, try again")), C41233s.m119492a("LOCKED_OUT", new C41232r("ცოტა ხანში ცადე რეგისტრაცია", "ცოტა ხანში ცადეთ რეგისტრაცია", "Try registration in a little while")), C41233s.m119492a("MISSING_GUIDANCE_IMAGES", new C41232r("რაღაც შეცდომა მოხდა, დასახმარებლად მიმართე ბანკს", "რაღაც შეცდომა მოხდა, დასახმარებლად მიმართეთ ბანკს", "An error occurred, for help please contact the bank")), C41233s.m119492a("USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT", new C41232r("რეგისტრაცია შეწყდა, თავიდან ცადე", "რეგისტრაცია შეწყდა, თავიდან ცადეთ", "Registration stopped, try again")), C41233s.m119492a("USER_CANCELLED", new C41232r("რეგისტრაცია შეწყდა, თავიდან ცადე", "რეგისტრაცია შეწყდა, თავიდან ცადეთ", "Registration stopped, try again")), C41233s.m119492a("USER_CANCELLED_VIA_HARDWARE_BUTTON", new C41232r("რეგისტრაცია შეწყდა, რადგან ღილაკ \"დასრულება\"-ს დააჭირე", "რეგისტრაცია შეწყდა, რადგან ღილაკ \"დასრულება\"-ს დააჭირეთ", "Registration stopped because you pressed \"cancel\" button")), C41233s.m119492a("EMPTY_FACE_BIOMETRICS", new C41232r("შენი სახე ვერ ამოვიცანით, თავიდან დაიწყე პროცესი", "თქვენი სახე ვერ ამოვიცანით, თავიდან დაიწყეთ პროცესი", "We couldn't identify your face, try again")), C41233s.m119492a("UNABLE_TO_SCAN_DOCUMENT_FRONT", new C41232r("დოკუმენტზე ინფორმაცია არ იკითხება, თავიდან ცადე", "დოკუმენტზე ინფორმაცია არ იკითხება, თავიდან ცადეთ", "We couldn't read the info on your document, try again")), C41233s.m119492a("UNABLE_TO_SCAN_DOCUMENT_BACK", new C41232r("დოკუმენტის უკანა გვერდზე ინფორმაცია არ იკითხება, თავიდან ცადე", "დოკუმენტის უკანა გვერდზე ინფორმაცია არ იკითხება, თავიდან ცადეთ", "We couldn't read the info on the back of your document, try again")), C41233s.m119492a("LIVENESS_CHECK_FAILED", new C41232r("ადამიანი ვერ დავაფიქსირეთ, თავიდან ცადე", "ადამიანი ვერ დავაფიქსირეთ, თავიდან ცადეთ", "We couldn't identify a person, try again")), C41233s.m119492a("HIGHRISK_COUNTRY", new C41232r("იმ ქვეყანაში სადაც იმყოფები, რეგისტრაცია შეუძლებელია", "იმ ქვეყანაში სადაც იმყოფებით, რეგისტრაცია შეუძლებელია", "Registration is not possible from the country where you are now")), C41233s.m119492a("FALSE_IDENTIFICATION", new C41232r("სამწუხაროდ, რეგისტრაციას ვერ შეძლებ", "სამწუხაროდ, რეგისტრაციას ვერ შეძლებთ", "Unfortunately, you can't register")));

    /* renamed from: b */
    private static final Map f71208b;

    /* renamed from: c */
    private static final Map f71209c;

    /* renamed from: d */
    private static final Map f71210d;

    /* renamed from: e */
    private static final Map f71211e;

    static {
        int i = C10220y.f28380a;
        int i2 = C10220y.f28381b;
        int i3 = C10220y.f28386g;
        int i4 = C10220y.f28385f;
        int i5 = C10220y.f28390k;
        int i6 = C10220y.f28387h;
        int i7 = C10220y.f28382c;
        int i8 = C10220y.f28393n;
        int i9 = C10220y.f28396q;
        int i12 = C10220y.f28395p;
        int i13 = C10220y.f28392m;
        int i14 = C10220y.f28394o;
        int i15 = C10220y.f28397r;
        int i16 = C10220y.f28399s;
        int i17 = i16;
        int i18 = C10220y.f28400t;
        int i19 = i18;
        int i22 = C10220y.f28402u;
        int i23 = i22;
        int i24 = C10220y.f28403v;
        int i25 = i24;
        int i26 = C10220y.f28361K;
        int i27 = i26;
        int i28 = C10220y.f28362L;
        int i29 = i28;
        int i32 = C10220y.f28363M;
        int i33 = i32;
        int i34 = C10220y.f28404w;
        int i35 = i34;
        int i36 = C10220y.f28405x;
        int i37 = i36;
        int i38 = C10220y.f28406y;
        int i39 = i38;
        int i42 = C10220y.f28407z;
        int i43 = i42;
        int i44 = C10220y.f28353C;
        int i45 = i44;
        int i46 = C10220y.f28352B;
        int i47 = i46;
        int i48 = C10220y.f28351A;
        int i49 = i48;
        int i52 = C10220y.f28354D;
        int i53 = i52;
        int i54 = C10220y.f28355E;
        int i55 = i54;
        int i56 = C10220y.f28356F;
        int i57 = i15;
        int i58 = C10220y.f28369Q;
        int i59 = i58;
        int i62 = C10220y.f28372T;
        int i63 = i62;
        int i64 = C10220y.f28371S;
        int i65 = i64;
        int i66 = C10220y.f28370R;
        int i67 = i66;
        int i68 = C10220y.f28373U;
        int i69 = i68;
        int i72 = C10220y.f28377Y;
        int i73 = i72;
        int i74 = C10220y.f28375W;
        int i75 = i74;
        int i76 = C10220y.f28376X;
        int i77 = i76;
        int i78 = C10220y.f28378Z;
        int i79 = i78;
        int i82 = C10220y.f28374V;
        int i83 = i82;
        int i84 = C10220y.f28391l;
        int i85 = i84;
        f71208b = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(i), "Cancel"), C41233s.m119492a(Integer.valueOf(i2), "Turn on flashlight"), C41233s.m119492a(Integer.valueOf(i3), "OK"), C41233s.m119492a(Integer.valueOf(i4), "I'm Ready"), C41233s.m119492a(Integer.valueOf(i5), "Take Photo"), C41233s.m119492a(Integer.valueOf(i6), "Retake"), C41233s.m119492a(Integer.valueOf(i7), "Accept"), C41233s.m119492a(Integer.valueOf(i8), "Enable Camera"), C41233s.m119492a(Integer.valueOf(i9), "To continue registration, click the Enable Camera button  and then OK"), C41233s.m119492a(Integer.valueOf(i12), "For registration we’ll need access to your camera"), C41233s.m119492a(Integer.valueOf(i13), "Confirm"), C41233s.m119492a(Integer.valueOf(i14), "Open Settings"), C41233s.m119492a(Integer.valueOf(i15), "Center Your Face"), C41233s.m119492a(Integer.valueOf(i16), "Put your face in the frame"), C41233s.m119492a(Integer.valueOf(i18), "Look Straight Ahead"), C41233s.m119492a(Integer.valueOf(i22), "Hold Your Head Straight"), C41233s.m119492a(Integer.valueOf(i24), "Hold in that position"), C41233s.m119492a(Integer.valueOf(i26), "Hold in that position for 1"), C41233s.m119492a(Integer.valueOf(i28), "Hold in that position for 2"), C41233s.m119492a(Integer.valueOf(i32), "Hold in that position for 3"), C41233s.m119492a(Integer.valueOf(i34), "Move a little away from the camera"), C41233s.m119492a(Integer.valueOf(i36), "Get a little closer to the camera"), C41233s.m119492a(Integer.valueOf(i38), "Raise Camera Up To Eye Level"), C41233s.m119492a(Integer.valueOf(i42), "Lighting level too low, try with better lighting"), C41233s.m119492a(Integer.valueOf(i44), "Which document will you use For the registration?"), C41233s.m119492a(Integer.valueOf(i46), "To focus click on the image"), C41233s.m119492a(Integer.valueOf(i48), "Hold the document in that position"), C41233s.m119492a(Integer.valueOf(i52), "Get Ready For"), C41233s.m119492a(Integer.valueOf(i54), "Your Video Selfie"), C41233s.m119492a(Integer.valueOf(i56), "Frame your face in the oval"), C41233s.m119492a(Integer.valueOf(i56), "Press I'm ready & Move Closer"), C41233s.m119492a(Integer.valueOf(i58), "Uploading\nJust wait for us"), C41233s.m119492a(Integer.valueOf(i62), "Confirmed"), C41233s.m119492a(Integer.valueOf(i64), "Uploading\nJust wait for us"), C41233s.m119492a(Integer.valueOf(i66), "Your face does not match Document photo"), C41233s.m119492a(Integer.valueOf(i68), "Let's Try Again"), C41233s.m119492a(Integer.valueOf(i72), "But First, We'll Recommend What To Improve"), C41233s.m119492a(Integer.valueOf(i74), "Natural Expression, No Smiling"), C41233s.m119492a(Integer.valueOf(i76), "Photo Should Not Have Extreme Lightning Or Glares"), C41233s.m119492a(Integer.valueOf(i78), "Your Photo"), C41233s.m119492a(Integer.valueOf(i82), "Ideal Photo"), C41233s.m119492a(Integer.valueOf(i84), "Try Again"));
        int i86 = C10220y.f28357G;
        int i87 = i86;
        f71209c = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(i), "გაუქმება"), C41233s.m119492a(Integer.valueOf(i2), "ჩართე მობილურის განათება"), C41233s.m119492a(Integer.valueOf(i3), "OK"), C41233s.m119492a(Integer.valueOf(i4), "მზად ვარ"), C41233s.m119492a(Integer.valueOf(i5), "ფოტოს გადაღება"), C41233s.m119492a(Integer.valueOf(i6), "თავიდან"), C41233s.m119492a(Integer.valueOf(i7), "დადასტურება"), C41233s.m119492a(Integer.valueOf(i8), "კამერაზე წვდომა"), C41233s.m119492a(Integer.valueOf(i9), "რეგისტრაციის გასაგრძელებლად, დააჭირე ღილაკს კამერის ჩართვა და შემდეგ OK"), C41233s.m119492a(Integer.valueOf(i12), "რეგისტრაციის გასაგრძელებლად კამერაზე წვდომა დაგვჭირდება"), C41233s.m119492a(Integer.valueOf(i13), "დადასტურება"), C41233s.m119492a(Integer.valueOf(i14), "პარამეტრები"), C41233s.m119492a(Integer.valueOf(i57), "მოათავსე სახე ჩარჩოს ცენტრში"), C41233s.m119492a(Integer.valueOf(i17), "მოათავსე სახე ჩარჩოში"), C41233s.m119492a(Integer.valueOf(i19), "პირდაპირ შეხედე კამერას"), C41233s.m119492a(Integer.valueOf(i23), "სწორად გეჭიროს თავი"), C41233s.m119492a(Integer.valueOf(i25), "დარჩი ამ პოზიციაში"), C41233s.m119492a(Integer.valueOf(i27), "დარჩი ამ პოზიციაში 1"), C41233s.m119492a(Integer.valueOf(i29), "დარჩი ამ პოზიციაში 2"), C41233s.m119492a(Integer.valueOf(i33), "დარჩი ამ პოზიციაში 3"), C41233s.m119492a(Integer.valueOf(i35), "ოდნავ დაშორდი კამერას"), C41233s.m119492a(Integer.valueOf(i37), "მიუახლოვდი კამერას"), C41233s.m119492a(Integer.valueOf(i39), "თვალის სიმაღლეზე გეჭიროს ტელეფონი"), C41233s.m119492a(Integer.valueOf(i43), "დაბალი განათებაა, სხვა რაკურსით ცადე"), C41233s.m119492a(Integer.valueOf(i45), "რომელი დოკუმენტით გაივლი რეგისტრაციას?"), C41233s.m119492a(Integer.valueOf(i47), "დასაფოკუსებლად დააჭირე გამოსახულებას"), C41233s.m119492a(Integer.valueOf(i49), "ამ პოზიციაში გეჭიროს დოკუმენტი"), C41233s.m119492a(Integer.valueOf(i53), "მოემზადე"), C41233s.m119492a(Integer.valueOf(i55), "ვიდეოს გადასაღებად"), C41233s.m119492a(Integer.valueOf(i56), "მოათავსე სახე ჩარჩოში"), C41233s.m119492a(Integer.valueOf(i86), "დააჭირე \"მზად ვარ\" და მიუახლოვდი კამერას"), C41233s.m119492a(Integer.valueOf(i59), "იტვირთება\nსულ ცოტაც დაგველოდე"), C41233s.m119492a(Integer.valueOf(i63), "დადასტურებულია"), C41233s.m119492a(Integer.valueOf(i65), "იტვირთება\nსულ ცოტაც დაგველოდე"), C41233s.m119492a(Integer.valueOf(i67), "სახე არ ემთხვევა შენი დოკუმენტის ფოტოს"), C41233s.m119492a(Integer.valueOf(i69), "კიდევ ერთხელ ცადე გადაღება"), C41233s.m119492a(Integer.valueOf(i73), "ჩვენ კი გირჩევთ რა უნდა გამოასწორო"), C41233s.m119492a(Integer.valueOf(i75), "მიიღე ბუნებრივი სახე, არ გაიღიმო"), C41233s.m119492a(Integer.valueOf(i77), "ფოტო არ უნდა იყოს გადანათებული ან არეკლილი, დაარეგულირე სინათლე"), C41233s.m119492a(Integer.valueOf(i79), "შენი ფოტო"), C41233s.m119492a(Integer.valueOf(i83), "იდეალური ფოტო"), C41233s.m119492a(Integer.valueOf(i85), "ახლიდან ცდა"));
        f71210d = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(i), "გაუქმება"), C41233s.m119492a(Integer.valueOf(i2), "ჩართეთ მობილურის განათება"), C41233s.m119492a(Integer.valueOf(i3), "OK"), C41233s.m119492a(Integer.valueOf(i4), "მზად ვარ"), C41233s.m119492a(Integer.valueOf(i5), "ფოტოს გადაღება"), C41233s.m119492a(Integer.valueOf(i6), "თავიდან"), C41233s.m119492a(Integer.valueOf(i7), "დადასტურება"), C41233s.m119492a(Integer.valueOf(i8), "კამერაზე წვდომა"), C41233s.m119492a(Integer.valueOf(i9), "რეგისტრაციის გასაგრძელებლად, დააჭირეთ ღილაკს კამერის ჩართვა და შემდეგ OK"), C41233s.m119492a(Integer.valueOf(i12), "რეგისტრაციის გასაგრძელებლად კამერაზე წვდომა დაგვჭირდება"), C41233s.m119492a(Integer.valueOf(i13), "დადასტურება"), C41233s.m119492a(Integer.valueOf(i14), "პარამეტრები"), C41233s.m119492a(Integer.valueOf(i57), "მოათავსეთ სახე ჩარჩოს ცენტრში"), C41233s.m119492a(Integer.valueOf(i17), "მოათავსეთ სახე ჩარჩოში"), C41233s.m119492a(Integer.valueOf(i19), "პირდაპირ შეხედეთ კამერას"), C41233s.m119492a(Integer.valueOf(i23), "სწორად გეჭიროთ თავი"), C41233s.m119492a(Integer.valueOf(i25), "დარჩით ამ პოზიციაში"), C41233s.m119492a(Integer.valueOf(i27), "დარჩით ამ პოზიციაში 1"), C41233s.m119492a(Integer.valueOf(i29), "დარჩით ამ პოზიციაში 2"), C41233s.m119492a(Integer.valueOf(i33), "დარჩით ამ პოზიციაში 3"), C41233s.m119492a(Integer.valueOf(i35), "ოდნავ დაშორდით კამერას"), C41233s.m119492a(Integer.valueOf(i37), "მიუახლოვდით კამერას"), C41233s.m119492a(Integer.valueOf(i39), "თვალის სიმაღლეზე გეჭიროს ტელეფონი"), C41233s.m119492a(Integer.valueOf(i43), "დაბალი განათებაა, სხვა რაკურსით ცადეთ"), C41233s.m119492a(Integer.valueOf(i45), "რომელი დოკუმენტით გაივლი რეგისტრაციას?"), C41233s.m119492a(Integer.valueOf(i47), "დასაფოკუსებლად დააჭირეთ გამოსახულებას"), C41233s.m119492a(Integer.valueOf(i49), "ამ პოზიციაში გეჭიროს დოკუმენტი"), C41233s.m119492a(Integer.valueOf(i53), "მოემზადეთ"), C41233s.m119492a(Integer.valueOf(i55), "ვიდეოს გადასაღებად"), C41233s.m119492a(Integer.valueOf(i56), "მოათავსეთ სახე ჩარჩოში"), C41233s.m119492a(Integer.valueOf(i87), "დააჭირეთ \"მზად ვარ\" და მიუახლოვდით კამერას"), C41233s.m119492a(Integer.valueOf(i59), "იტვირთება\nსულ ცოტაც დაგველოდეთ"), C41233s.m119492a(Integer.valueOf(i63), "დადასტურებულია"), C41233s.m119492a(Integer.valueOf(i65), "იტვირთება\nსულ ცოტაც დაგველოდეთ"), C41233s.m119492a(Integer.valueOf(i67), "სახე არ ემთხვევა თქვენი დოკუმენტის ფოტოს"), C41233s.m119492a(Integer.valueOf(i69), "კიდევ ერთხელ ცადეთ გადაღება"), C41233s.m119492a(Integer.valueOf(i73), "ჩვენ კი გირჩევთ რა უნდა გამოასწორო"), C41233s.m119492a(Integer.valueOf(i75), "მიიღეთ ბუნებრივი სახე, არ გაიღიმოთ"), C41233s.m119492a(Integer.valueOf(i77), "ფოტო არ უნდა იყოს გადანათებული ან არეკლილი, დაარეგულირეთ სინათლე"), C41233s.m119492a(Integer.valueOf(i79), "თქვენი ფოტო"), C41233s.m119492a(Integer.valueOf(i83), "იდეალური ფოტო"), C41233s.m119492a(Integer.valueOf(i85), "ახლიდან ცდა"));
        f71211e = C41344r0.m119931m(C41233s.m119492a(Integer.valueOf(i), "facetec.accessibility.cancel.button"), C41233s.m119492a(Integer.valueOf(i2), "facetec.accessibility.torch.button"), C41233s.m119492a(Integer.valueOf(i3), "facetec.action.ok"), C41233s.m119492a(Integer.valueOf(i4), "facetec.action.im.ready"), C41233s.m119492a(Integer.valueOf(i5), "facetec.action.take.photo"), C41233s.m119492a(Integer.valueOf(i6), "facetec.action.retake.photo"), C41233s.m119492a(Integer.valueOf(i7), "facetec.action.accept.photo"), C41233s.m119492a(Integer.valueOf(i8), "facetec.camera.permission.header"), C41233s.m119492a(Integer.valueOf(i9), "facetec.camera.permission.message.enroll"), C41233s.m119492a(Integer.valueOf(i12), "facetec.camera.permission.message.auth"), C41233s.m119492a(Integer.valueOf(i13), "facetec.camera.permission.enable.camera"), C41233s.m119492a(Integer.valueOf(i14), "facetec.camera.permission.launch.settings"), C41233s.m119492a(Integer.valueOf(i57), "facetec.feedback.center.face"), C41233s.m119492a(Integer.valueOf(i17), "facetec.feedback.face.not.found"), C41233s.m119492a(Integer.valueOf(i19), "facetec.feedback.face.not.looking.straight.ahead"), C41233s.m119492a(Integer.valueOf(i23), "facetec.feedback.face.not.upright"), C41233s.m119492a(Integer.valueOf(i25), "facetec.feedback.hold.steady"), C41233s.m119492a(Integer.valueOf(i27), "facetec.presession.hold.steady.1"), C41233s.m119492a(Integer.valueOf(i29), "facetec.presession.hold.steady.2"), C41233s.m119492a(Integer.valueOf(i33), "facetec.presession.hold.steady.3"), C41233s.m119492a(Integer.valueOf(i35), "facetec.feedback.move.phone.away"), C41233s.m119492a(Integer.valueOf(i37), "facetec.feedback.move.phone.closer"), C41233s.m119492a(Integer.valueOf(i39), "facetec.feedback.move.phone.to.eye.level"), C41233s.m119492a(Integer.valueOf(i43), "facetec.feedback.use.even.lighting"), C41233s.m119492a(Integer.valueOf(i45), "facetec.idscan.type.selection.header"), C41233s.m119492a(Integer.valueOf(i47), "facetec.idscan.capture.tap.to.focus.message"), C41233s.m119492a(Integer.valueOf(i49), "facetec.idscan.capture.hold.steady.message"), C41233s.m119492a(Integer.valueOf(i53), "facetec.instructions.header.ready.1"), C41233s.m119492a(Integer.valueOf(i55), "facetec.instructions.header.ready.2"), C41233s.m119492a(Integer.valueOf(i56), "facetec.instructions.message.ready.1"), C41233s.m119492a(Integer.valueOf(i87), "facetec.instructions.message.ready.2"), C41233s.m119492a(Integer.valueOf(i59), "facetec.result.facescan.upload.message"), C41233s.m119492a(Integer.valueOf(i63), "facetec.result.success.message"), C41233s.m119492a(Integer.valueOf(i65), "facetec.result.idscan.upload.message"), C41233s.m119492a(Integer.valueOf(i67), "facetec.result.idscan.unsuccess.message"), C41233s.m119492a(Integer.valueOf(i69), "facetec.retry.header"), C41233s.m119492a(Integer.valueOf(i73), "facetec.retry.subheader.message"), C41233s.m119492a(Integer.valueOf(i75), "facetec.retry.instruction.message.1"), C41233s.m119492a(Integer.valueOf(i77), "facetec.retry.instruction.message.2"), C41233s.m119492a(Integer.valueOf(i79), "facetec.retry.your.image.label"), C41233s.m119492a(Integer.valueOf(i83), "facetec.retry.ideal.image.label"), C41233s.m119492a(Integer.valueOf(i85), "facetec.action.try.again"), C41233s.m119492a(Integer.valueOf(C10220y.f28384e), "facetec.action.continue"), C41233s.m119492a(Integer.valueOf(C10220y.f28383d), "facetec.action.confirm"), C41233s.m119492a(Integer.valueOf(C10220y.f28388i), "facetec.action.scan.nfc"), C41233s.m119492a(Integer.valueOf(C10220y.f28389j), "facetec.action.skip.nfc"), C41233s.m119492a(Integer.valueOf(C10220y.f28360J), "facetec.presession.frame.your.face"), C41233s.m119492a(Integer.valueOf(C10220y.f28365O), "facetec.presession.position.face.straight.in.oval"), C41233s.m119492a(Integer.valueOf(C10220y.f28367P), "facetec.presession.remove.dark.glasses"), C41233s.m119492a(Integer.valueOf(C10220y.f28364N), "facetec.presession.neutral.expression"), C41233s.m119492a(Integer.valueOf(C10220y.f28359I), "facetec.presession.conditions.too.bright"), C41233s.m119492a(Integer.valueOf(C10220y.f28358H), "facetec.presession.brighten.your.environment"));
    }

    /* renamed from: a */
    public static final Map m86368a() {
        return f71208b;
    }

    /* renamed from: b */
    public static final Map m86369b() {
        return f71207a;
    }

    /* renamed from: c */
    public static final Map m86370c() {
        return f71211e;
    }

    /* renamed from: d */
    public static final Map m86371d() {
        return f71209c;
    }
}
