package it.vfsfitvnm.vimusic;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DatabaseInitializer_Impl extends DatabaseInitializer {
  private volatile Database _database;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(23) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Song` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `artistsText` TEXT, `durationText` TEXT, `thumbnailUrl` TEXT, `likedAt` INTEGER, `totalPlayTimeMs` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SongPlaylistMap` (`songId` TEXT NOT NULL, `playlistId` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`songId`, `playlistId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`playlistId`) REFERENCES `Playlist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongPlaylistMap_songId` ON `SongPlaylistMap` (`songId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongPlaylistMap_playlistId` ON `SongPlaylistMap` (`playlistId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Playlist` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `browseId` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Artist` (`id` TEXT NOT NULL, `name` TEXT, `thumbnailUrl` TEXT, `timestamp` INTEGER, `bookmarkedAt` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SongArtistMap` (`songId` TEXT NOT NULL, `artistId` TEXT NOT NULL, PRIMARY KEY(`songId`, `artistId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`artistId`) REFERENCES `Artist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongArtistMap_songId` ON `SongArtistMap` (`songId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongArtistMap_artistId` ON `SongArtistMap` (`artistId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Album` (`id` TEXT NOT NULL, `title` TEXT, `thumbnailUrl` TEXT, `year` TEXT, `authorsText` TEXT, `shareUrl` TEXT, `timestamp` INTEGER, `bookmarkedAt` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SongAlbumMap` (`songId` TEXT NOT NULL, `albumId` TEXT NOT NULL, `position` INTEGER, PRIMARY KEY(`songId`, `albumId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`albumId`) REFERENCES `Album`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongAlbumMap_songId` ON `SongAlbumMap` (`songId`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SongAlbumMap_albumId` ON `SongAlbumMap` (`albumId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SearchQuery` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `query` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SearchQuery_query` ON `SearchQuery` (`query`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `QueuedMediaItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mediaItem` BLOB NOT NULL, `position` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Format` (`songId` TEXT NOT NULL, `itag` INTEGER, `mimeType` TEXT, `bitrate` INTEGER, `contentLength` INTEGER, `lastModified` INTEGER, `loudnessDb` REAL, PRIMARY KEY(`songId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `songId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `playTime` INTEGER NOT NULL, FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Event_songId` ON `Event` (`songId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Lyrics` (`songId` TEXT NOT NULL, `fixed` TEXT, `synced` TEXT, PRIMARY KEY(`songId`), FOREIGN KEY(`songId`) REFERENCES `Song`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '205c24811149a247279bcbfdc2d6c396')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Song`");
        _db.execSQL("DROP TABLE IF EXISTS `SongPlaylistMap`");
        _db.execSQL("DROP TABLE IF EXISTS `Playlist`");
        _db.execSQL("DROP TABLE IF EXISTS `Artist`");
        _db.execSQL("DROP TABLE IF EXISTS `SongArtistMap`");
        _db.execSQL("DROP TABLE IF EXISTS `Album`");
        _db.execSQL("DROP TABLE IF EXISTS `SongAlbumMap`");
        _db.execSQL("DROP TABLE IF EXISTS `SearchQuery`");
        _db.execSQL("DROP TABLE IF EXISTS `QueuedMediaItem`");
        _db.execSQL("DROP TABLE IF EXISTS `Format`");
        _db.execSQL("DROP TABLE IF EXISTS `Event`");
        _db.execSQL("DROP TABLE IF EXISTS `Lyrics`");
        _db.execSQL("DROP VIEW IF EXISTS `SortedSongPlaylistMap`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSong = new HashMap<String, TableInfo.Column>(7);
        _columnsSong.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("artistsText", new TableInfo.Column("artistsText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("durationText", new TableInfo.Column("durationText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("likedAt", new TableInfo.Column("likedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSong.put("totalPlayTimeMs", new TableInfo.Column("totalPlayTimeMs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSong = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSong = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSong = new TableInfo("Song", _columnsSong, _foreignKeysSong, _indicesSong);
        final TableInfo _existingSong = TableInfo.read(_db, "Song");
        if (! _infoSong.equals(_existingSong)) {
          return new RoomOpenHelper.ValidationResult(false, "Song(it.vfsfitvnm.vimusic.models.Song).\n"
                  + " Expected:\n" + _infoSong + "\n"
                  + " Found:\n" + _existingSong);
        }
        final HashMap<String, TableInfo.Column> _columnsSongPlaylistMap = new HashMap<String, TableInfo.Column>(3);
        _columnsSongPlaylistMap.put("songId", new TableInfo.Column("songId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongPlaylistMap.put("playlistId", new TableInfo.Column("playlistId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongPlaylistMap.put("position", new TableInfo.Column("position", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSongPlaylistMap = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysSongPlaylistMap.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        _foreignKeysSongPlaylistMap.add(new TableInfo.ForeignKey("Playlist", "CASCADE", "NO ACTION",Arrays.asList("playlistId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesSongPlaylistMap = new HashSet<TableInfo.Index>(2);
        _indicesSongPlaylistMap.add(new TableInfo.Index("index_SongPlaylistMap_songId", false, Arrays.asList("songId"), Arrays.asList("ASC")));
        _indicesSongPlaylistMap.add(new TableInfo.Index("index_SongPlaylistMap_playlistId", false, Arrays.asList("playlistId"), Arrays.asList("ASC")));
        final TableInfo _infoSongPlaylistMap = new TableInfo("SongPlaylistMap", _columnsSongPlaylistMap, _foreignKeysSongPlaylistMap, _indicesSongPlaylistMap);
        final TableInfo _existingSongPlaylistMap = TableInfo.read(_db, "SongPlaylistMap");
        if (! _infoSongPlaylistMap.equals(_existingSongPlaylistMap)) {
          return new RoomOpenHelper.ValidationResult(false, "SongPlaylistMap(it.vfsfitvnm.vimusic.models.SongPlaylistMap).\n"
                  + " Expected:\n" + _infoSongPlaylistMap + "\n"
                  + " Found:\n" + _existingSongPlaylistMap);
        }
        final HashMap<String, TableInfo.Column> _columnsPlaylist = new HashMap<String, TableInfo.Column>(3);
        _columnsPlaylist.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylist.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylist.put("browseId", new TableInfo.Column("browseId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylist = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylist = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlaylist = new TableInfo("Playlist", _columnsPlaylist, _foreignKeysPlaylist, _indicesPlaylist);
        final TableInfo _existingPlaylist = TableInfo.read(_db, "Playlist");
        if (! _infoPlaylist.equals(_existingPlaylist)) {
          return new RoomOpenHelper.ValidationResult(false, "Playlist(it.vfsfitvnm.vimusic.models.Playlist).\n"
                  + " Expected:\n" + _infoPlaylist + "\n"
                  + " Found:\n" + _existingPlaylist);
        }
        final HashMap<String, TableInfo.Column> _columnsArtist = new HashMap<String, TableInfo.Column>(5);
        _columnsArtist.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtist.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtist.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtist.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtist.put("bookmarkedAt", new TableInfo.Column("bookmarkedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArtist = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArtist = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArtist = new TableInfo("Artist", _columnsArtist, _foreignKeysArtist, _indicesArtist);
        final TableInfo _existingArtist = TableInfo.read(_db, "Artist");
        if (! _infoArtist.equals(_existingArtist)) {
          return new RoomOpenHelper.ValidationResult(false, "Artist(it.vfsfitvnm.vimusic.models.Artist).\n"
                  + " Expected:\n" + _infoArtist + "\n"
                  + " Found:\n" + _existingArtist);
        }
        final HashMap<String, TableInfo.Column> _columnsSongArtistMap = new HashMap<String, TableInfo.Column>(2);
        _columnsSongArtistMap.put("songId", new TableInfo.Column("songId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongArtistMap.put("artistId", new TableInfo.Column("artistId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSongArtistMap = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysSongArtistMap.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        _foreignKeysSongArtistMap.add(new TableInfo.ForeignKey("Artist", "CASCADE", "NO ACTION",Arrays.asList("artistId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesSongArtistMap = new HashSet<TableInfo.Index>(2);
        _indicesSongArtistMap.add(new TableInfo.Index("index_SongArtistMap_songId", false, Arrays.asList("songId"), Arrays.asList("ASC")));
        _indicesSongArtistMap.add(new TableInfo.Index("index_SongArtistMap_artistId", false, Arrays.asList("artistId"), Arrays.asList("ASC")));
        final TableInfo _infoSongArtistMap = new TableInfo("SongArtistMap", _columnsSongArtistMap, _foreignKeysSongArtistMap, _indicesSongArtistMap);
        final TableInfo _existingSongArtistMap = TableInfo.read(_db, "SongArtistMap");
        if (! _infoSongArtistMap.equals(_existingSongArtistMap)) {
          return new RoomOpenHelper.ValidationResult(false, "SongArtistMap(it.vfsfitvnm.vimusic.models.SongArtistMap).\n"
                  + " Expected:\n" + _infoSongArtistMap + "\n"
                  + " Found:\n" + _existingSongArtistMap);
        }
        final HashMap<String, TableInfo.Column> _columnsAlbum = new HashMap<String, TableInfo.Column>(8);
        _columnsAlbum.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("year", new TableInfo.Column("year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("authorsText", new TableInfo.Column("authorsText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("shareUrl", new TableInfo.Column("shareUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAlbum.put("bookmarkedAt", new TableInfo.Column("bookmarkedAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAlbum = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAlbum = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAlbum = new TableInfo("Album", _columnsAlbum, _foreignKeysAlbum, _indicesAlbum);
        final TableInfo _existingAlbum = TableInfo.read(_db, "Album");
        if (! _infoAlbum.equals(_existingAlbum)) {
          return new RoomOpenHelper.ValidationResult(false, "Album(it.vfsfitvnm.vimusic.models.Album).\n"
                  + " Expected:\n" + _infoAlbum + "\n"
                  + " Found:\n" + _existingAlbum);
        }
        final HashMap<String, TableInfo.Column> _columnsSongAlbumMap = new HashMap<String, TableInfo.Column>(3);
        _columnsSongAlbumMap.put("songId", new TableInfo.Column("songId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongAlbumMap.put("albumId", new TableInfo.Column("albumId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongAlbumMap.put("position", new TableInfo.Column("position", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSongAlbumMap = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysSongAlbumMap.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        _foreignKeysSongAlbumMap.add(new TableInfo.ForeignKey("Album", "CASCADE", "NO ACTION",Arrays.asList("albumId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesSongAlbumMap = new HashSet<TableInfo.Index>(2);
        _indicesSongAlbumMap.add(new TableInfo.Index("index_SongAlbumMap_songId", false, Arrays.asList("songId"), Arrays.asList("ASC")));
        _indicesSongAlbumMap.add(new TableInfo.Index("index_SongAlbumMap_albumId", false, Arrays.asList("albumId"), Arrays.asList("ASC")));
        final TableInfo _infoSongAlbumMap = new TableInfo("SongAlbumMap", _columnsSongAlbumMap, _foreignKeysSongAlbumMap, _indicesSongAlbumMap);
        final TableInfo _existingSongAlbumMap = TableInfo.read(_db, "SongAlbumMap");
        if (! _infoSongAlbumMap.equals(_existingSongAlbumMap)) {
          return new RoomOpenHelper.ValidationResult(false, "SongAlbumMap(it.vfsfitvnm.vimusic.models.SongAlbumMap).\n"
                  + " Expected:\n" + _infoSongAlbumMap + "\n"
                  + " Found:\n" + _existingSongAlbumMap);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchQuery = new HashMap<String, TableInfo.Column>(2);
        _columnsSearchQuery.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchQuery.put("query", new TableInfo.Column("query", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchQuery = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchQuery = new HashSet<TableInfo.Index>(1);
        _indicesSearchQuery.add(new TableInfo.Index("index_SearchQuery_query", true, Arrays.asList("query"), Arrays.asList("ASC")));
        final TableInfo _infoSearchQuery = new TableInfo("SearchQuery", _columnsSearchQuery, _foreignKeysSearchQuery, _indicesSearchQuery);
        final TableInfo _existingSearchQuery = TableInfo.read(_db, "SearchQuery");
        if (! _infoSearchQuery.equals(_existingSearchQuery)) {
          return new RoomOpenHelper.ValidationResult(false, "SearchQuery(it.vfsfitvnm.vimusic.models.SearchQuery).\n"
                  + " Expected:\n" + _infoSearchQuery + "\n"
                  + " Found:\n" + _existingSearchQuery);
        }
        final HashMap<String, TableInfo.Column> _columnsQueuedMediaItem = new HashMap<String, TableInfo.Column>(3);
        _columnsQueuedMediaItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQueuedMediaItem.put("mediaItem", new TableInfo.Column("mediaItem", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQueuedMediaItem.put("position", new TableInfo.Column("position", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQueuedMediaItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQueuedMediaItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQueuedMediaItem = new TableInfo("QueuedMediaItem", _columnsQueuedMediaItem, _foreignKeysQueuedMediaItem, _indicesQueuedMediaItem);
        final TableInfo _existingQueuedMediaItem = TableInfo.read(_db, "QueuedMediaItem");
        if (! _infoQueuedMediaItem.equals(_existingQueuedMediaItem)) {
          return new RoomOpenHelper.ValidationResult(false, "QueuedMediaItem(it.vfsfitvnm.vimusic.models.QueuedMediaItem).\n"
                  + " Expected:\n" + _infoQueuedMediaItem + "\n"
                  + " Found:\n" + _existingQueuedMediaItem);
        }
        final HashMap<String, TableInfo.Column> _columnsFormat = new HashMap<String, TableInfo.Column>(7);
        _columnsFormat.put("songId", new TableInfo.Column("songId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("itag", new TableInfo.Column("itag", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("mimeType", new TableInfo.Column("mimeType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("bitrate", new TableInfo.Column("bitrate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("contentLength", new TableInfo.Column("contentLength", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("lastModified", new TableInfo.Column("lastModified", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFormat.put("loudnessDb", new TableInfo.Column("loudnessDb", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFormat = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysFormat.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesFormat = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFormat = new TableInfo("Format", _columnsFormat, _foreignKeysFormat, _indicesFormat);
        final TableInfo _existingFormat = TableInfo.read(_db, "Format");
        if (! _infoFormat.equals(_existingFormat)) {
          return new RoomOpenHelper.ValidationResult(false, "Format(it.vfsfitvnm.vimusic.models.Format).\n"
                  + " Expected:\n" + _infoFormat + "\n"
                  + " Found:\n" + _existingFormat);
        }
        final HashMap<String, TableInfo.Column> _columnsEvent = new HashMap<String, TableInfo.Column>(4);
        _columnsEvent.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvent.put("songId", new TableInfo.Column("songId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvent.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvent.put("playTime", new TableInfo.Column("playTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEvent = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEvent.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEvent = new HashSet<TableInfo.Index>(1);
        _indicesEvent.add(new TableInfo.Index("index_Event_songId", false, Arrays.asList("songId"), Arrays.asList("ASC")));
        final TableInfo _infoEvent = new TableInfo("Event", _columnsEvent, _foreignKeysEvent, _indicesEvent);
        final TableInfo _existingEvent = TableInfo.read(_db, "Event");
        if (! _infoEvent.equals(_existingEvent)) {
          return new RoomOpenHelper.ValidationResult(false, "Event(it.vfsfitvnm.vimusic.models.Event).\n"
                  + " Expected:\n" + _infoEvent + "\n"
                  + " Found:\n" + _existingEvent);
        }
        final HashMap<String, TableInfo.Column> _columnsLyrics = new HashMap<String, TableInfo.Column>(3);
        _columnsLyrics.put("songId", new TableInfo.Column("songId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLyrics.put("fixed", new TableInfo.Column("fixed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLyrics.put("synced", new TableInfo.Column("synced", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLyrics = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysLyrics.add(new TableInfo.ForeignKey("Song", "CASCADE", "NO ACTION",Arrays.asList("songId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesLyrics = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLyrics = new TableInfo("Lyrics", _columnsLyrics, _foreignKeysLyrics, _indicesLyrics);
        final TableInfo _existingLyrics = TableInfo.read(_db, "Lyrics");
        if (! _infoLyrics.equals(_existingLyrics)) {
          return new RoomOpenHelper.ValidationResult(false, "Lyrics(it.vfsfitvnm.vimusic.models.Lyrics).\n"
                  + " Expected:\n" + _infoLyrics + "\n"
                  + " Found:\n" + _existingLyrics);
        }
        final ViewInfo _infoSortedSongPlaylistMap = new ViewInfo("SortedSongPlaylistMap", "CREATE VIEW `SortedSongPlaylistMap` AS SELECT * FROM SongPlaylistMap ORDER BY position");
        final ViewInfo _existingSortedSongPlaylistMap = ViewInfo.read(_db, "SortedSongPlaylistMap");
        if (! _infoSortedSongPlaylistMap.equals(_existingSortedSongPlaylistMap)) {
          return new RoomOpenHelper.ValidationResult(false, "SortedSongPlaylistMap(it.vfsfitvnm.vimusic.models.SortedSongPlaylistMap).\n"
                  + " Expected:\n" + _infoSortedSongPlaylistMap + "\n"
                  + " Found:\n" + _existingSortedSongPlaylistMap);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "205c24811149a247279bcbfdc2d6c396", "f5c46354272cf82d45838c429ec13efa");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(1);
    HashSet<String> _tables = new HashSet<String>(1);
    _tables.add("SongPlaylistMap");
    _viewTables.put("sortedsongplaylistmap", _tables);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Song","SongPlaylistMap","Playlist","Artist","SongArtistMap","Album","SongAlbumMap","SearchQuery","QueuedMediaItem","Format","Event","Lyrics");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Song`");
      _db.execSQL("DELETE FROM `SongPlaylistMap`");
      _db.execSQL("DELETE FROM `Playlist`");
      _db.execSQL("DELETE FROM `Artist`");
      _db.execSQL("DELETE FROM `SongArtistMap`");
      _db.execSQL("DELETE FROM `Album`");
      _db.execSQL("DELETE FROM `SongAlbumMap`");
      _db.execSQL("DELETE FROM `SearchQuery`");
      _db.execSQL("DELETE FROM `QueuedMediaItem`");
      _db.execSQL("DELETE FROM `Format`");
      _db.execSQL("DELETE FROM `Event`");
      _db.execSQL("DELETE FROM `Lyrics`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(Database.class, Database_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList(new DatabaseInitializer_AutoMigration_1_2_Impl(),
        new DatabaseInitializer_AutoMigration_2_3_Impl(),
        new DatabaseInitializer_AutoMigration_3_4_Impl(),
        new DatabaseInitializer_AutoMigration_4_5_Impl(),
        new DatabaseInitializer_AutoMigration_5_6_Impl(),
        new DatabaseInitializer_AutoMigration_6_7_Impl(),
        new DatabaseInitializer_AutoMigration_7_8_Impl(),
        new DatabaseInitializer_AutoMigration_9_10_Impl(),
        new DatabaseInitializer_AutoMigration_11_12_Impl(),
        new DatabaseInitializer_AutoMigration_12_13_Impl(),
        new DatabaseInitializer_AutoMigration_13_14_Impl(),
        new DatabaseInitializer_AutoMigration_15_16_Impl(),
        new DatabaseInitializer_AutoMigration_16_17_Impl(),
        new DatabaseInitializer_AutoMigration_17_18_Impl(),
        new DatabaseInitializer_AutoMigration_18_19_Impl(),
        new DatabaseInitializer_AutoMigration_19_20_Impl(),
        new DatabaseInitializer_AutoMigration_20_21_Impl(),
        new DatabaseInitializer_AutoMigration_21_22_Impl());
  }

  @Override
  public Database getDatabase() {
    if (_database != null) {
      return _database;
    } else {
      synchronized(this) {
        if(_database == null) {
          _database = new Database_Impl(this);
        }
        return _database;
      }
    }
  }
}
