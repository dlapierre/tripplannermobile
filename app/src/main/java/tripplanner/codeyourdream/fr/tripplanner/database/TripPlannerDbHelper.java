package tripplanner.codeyourdream.fr.tripplanner.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by David on 31/10/2017.
 */

public class TripPlannerDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "TripPlanner.db";

    private static final String SQL_CREATE_ENTRIES_VOYAGE =
            "CREATE TABLE " + TripPlannerContract.VoyageEntry.TABLE_NAME + " (" +
                    TripPlannerContract.VoyageEntry._ID + " INTEGER PRIMARY KEY," +
                    TripPlannerContract.VoyageEntry.COLUMN_NAME_NOM + " TEXT," +
                    TripPlannerContract.VoyageEntry.COLUMN_NAME_STATUT + " INTEGER)";

    private static final String SQL_CREATE_ENTRIES_STAGE =
            "CREATE TABLE " + TripPlannerContract.StageEntry.TABLE_NAME + " (" +
                    TripPlannerContract.StageEntry._ID + " INTEGER PRIMARY KEY," +
                    TripPlannerContract.StageEntry.COLUMN_NAME_NOM + " TEXT," +
                    TripPlannerContract.StageEntry.COLUMN_NAME_VOYAGE + " INTEGER," +
                    TripPlannerContract.StageEntry.COLUMN_NAME_DUREE + " INTEGER,"  +
                    TripPlannerContract.StageEntry.COLUMN_NAME_LIEU_ARRIVEE + " TEXT," +
                    TripPlannerContract.StageEntry.COLUMN_NAME_LIEU_DEBUT + " TEXT)";

    private static final String SQL_CREATE_ENTRIES_PI =
            "CREATE TABLE " + TripPlannerContract.PIEntry.TABLE_NAME + " (" +
                    TripPlannerContract.PIEntry._ID + " INTEGER PRIMARY KEY," +
                    TripPlannerContract.PIEntry.COLUMN_NAME_NOM + " TEXT," +
                    TripPlannerContract.PIEntry.COLUMN_NAME_LIEU + " TEXT," +
                    TripPlannerContract.PIEntry.COLUMN_NAME_HEURE + " TEXT,"  +
                    TripPlannerContract.PIEntry.COLUMN_NAME_REMARQUE + " TEXT," +
                    TripPlannerContract.PIEntry.COLUMN_NAME_STAGE + " INTEGER)";

    private static final String SQL_CREATE_ENTRIES_INFO =
            "CREATE TABLE " + TripPlannerContract.InfoEntry.TABLE_NAME + " (" +
                    TripPlannerContract.InfoEntry._ID + " INTEGER PRIMARY KEY," +
                    TripPlannerContract.InfoEntry.COLUMN_NAME_PI + " INTEGER," +
                    TripPlannerContract.InfoEntry.COLUMN_NAME_STAGE + " INTEGER," +
                    TripPlannerContract.InfoEntry.COLUMN_NAME_NOM_CHAMP + " TEXT,"  +
                    TripPlannerContract.InfoEntry.COLUMN_NAME_TYPE_CHAMP + " TEXT," +
                    TripPlannerContract.InfoEntry.COLUMN_NAME_VALEUR_CHAMP + " INTEGER)";

    //Requête globale de création de la base
    private static final String SQL_CREATE_ENTRIES = SQL_CREATE_ENTRIES_VOYAGE + " " +
            SQL_CREATE_ENTRIES_STAGE + " " +
            SQL_CREATE_ENTRIES_PI + " " +
            SQL_CREATE_ENTRIES_INFO;

    public TripPlannerDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
