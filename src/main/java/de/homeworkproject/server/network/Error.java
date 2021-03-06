package de.homeworkproject.server.network;

/**
 * Created by Life4YourGames on 06.07.16.
 */
public class Error {

    public static String LoginRequired = "LoginRequiredError";

    public static String BadRequest = "ProtocolError";

    public static String InsuffPerm = "InsufficientPermissionError";

    public static String NotFound = "NotFoundError";

    public static String InvalidCred = "InvalidCredentialsError";

    public static String AddHWError = "AddHWError";

    public static String DelHWError = "DelHWError";

    public static String EditHWError = "EditHWError";

    public static String DateTimeError = "DateTimeError";

    public static String InternalError = "InternalError";

    public static String LimitExceeded = "LimitExceededError";

    public static String Unavailable = "ServiceUnavailable";

    public static String Unauthorized = InsuffPerm;
}
