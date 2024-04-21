package it.vfsfitvnm.vimusic;

import android.database.Cursor;
import android.database.SQLException;
import androidx.collection.LongSparseArray;
import androidx.media3.common.MediaItem;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import it.vfsfitvnm.vimusic.enums.AlbumSortBy;
import it.vfsfitvnm.vimusic.enums.ArtistSortBy;
import it.vfsfitvnm.vimusic.enums.PlaylistSortBy;
import it.vfsfitvnm.vimusic.enums.SongSortBy;
import it.vfsfitvnm.vimusic.enums.SortOrder;
import it.vfsfitvnm.vimusic.models.Album;
import it.vfsfitvnm.vimusic.models.Artist;
import it.vfsfitvnm.vimusic.models.Event;
import it.vfsfitvnm.vimusic.models.Format;
import it.vfsfitvnm.vimusic.models.Info;
import it.vfsfitvnm.vimusic.models.Lyrics;
import it.vfsfitvnm.vimusic.models.Playlist;
import it.vfsfitvnm.vimusic.models.PlaylistPreview;
import it.vfsfitvnm.vimusic.models.PlaylistWithSongs;
import it.vfsfitvnm.vimusic.models.QueuedMediaItem;
import it.vfsfitvnm.vimusic.models.SearchQuery;
import it.vfsfitvnm.vimusic.models.Song;
import it.vfsfitvnm.vimusic.models.SongAlbumMap;
import it.vfsfitvnm.vimusic.models.SongArtistMap;
import it.vfsfitvnm.vimusic.models.SongPlaylistMap;
import it.vfsfitvnm.vimusic.models.SongWithContentLength;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Database_Impl implements Database {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Event> __insertionAdapterOfEvent;

  private final EntityInsertionAdapter<Format> __insertionAdapterOfFormat;

  private final EntityInsertionAdapter<SearchQuery> __insertionAdapterOfSearchQuery;

  private final EntityInsertionAdapter<Playlist> __insertionAdapterOfPlaylist;

  private final EntityInsertionAdapter<SongPlaylistMap> __insertionAdapterOfSongPlaylistMap;

  private final EntityInsertionAdapter<SongArtistMap> __insertionAdapterOfSongArtistMap;

  private final EntityInsertionAdapter<Song> __insertionAdapterOfSong;

  private final EntityInsertionAdapter<QueuedMediaItem> __insertionAdapterOfQueuedMediaItem;

  private final EntityInsertionAdapter<Album> __insertionAdapterOfAlbum;

  private final EntityInsertionAdapter<SongAlbumMap> __insertionAdapterOfSongAlbumMap;

  private final EntityInsertionAdapter<Artist> __insertionAdapterOfArtist;

  private final EntityInsertionAdapter<SongArtistMap> __insertionAdapterOfSongArtistMap_1;

  private final EntityDeletionOrUpdateAdapter<SearchQuery> __deletionAdapterOfSearchQuery;

  private final EntityDeletionOrUpdateAdapter<Playlist> __deletionAdapterOfPlaylist;

  private final EntityDeletionOrUpdateAdapter<SongPlaylistMap> __deletionAdapterOfSongPlaylistMap;

  private final EntityDeletionOrUpdateAdapter<Artist> __updateAdapterOfArtist;

  private final EntityDeletionOrUpdateAdapter<Album> __updateAdapterOfAlbum;

  private final EntityDeletionOrUpdateAdapter<Playlist> __updateAdapterOfPlaylist;

  private final SharedSQLiteStatement __preparedStmtOfClearQueue;

  private final SharedSQLiteStatement __preparedStmtOfClearQueries;

  private final SharedSQLiteStatement __preparedStmtOfLike;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDurationText;

  private final SharedSQLiteStatement __preparedStmtOfIncrementTotalPlayTimeMs;

  private final SharedSQLiteStatement __preparedStmtOfMove;

  private final SharedSQLiteStatement __preparedStmtOfClearPlaylist;

  private final SharedSQLiteStatement __preparedStmtOfClearAlbum;

  private final SharedSQLiteStatement __preparedStmtOfClearEvents;

  private final SharedSQLiteStatement __preparedStmtOfClearEventsFor;

  private final EntityUpsertionAdapter<Lyrics> __upsertionAdapterOfLyrics;

  private final EntityUpsertionAdapter<Album> __upsertionAdapterOfAlbum;

  private final EntityUpsertionAdapter<SongAlbumMap> __upsertionAdapterOfSongAlbumMap;

  private final EntityUpsertionAdapter<Artist> __upsertionAdapterOfArtist;

  public Database_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEvent = new EntityInsertionAdapter<Event>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Event` (`id`,`songId`,`timestamp`,`playTime`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Event value) {
        stmt.bindLong(1, value.getId());
        if (value.getSongId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSongId());
        }
        stmt.bindLong(3, value.getTimestamp());
        stmt.bindLong(4, value.getPlayTime());
      }
    };
    this.__insertionAdapterOfFormat = new EntityInsertionAdapter<Format>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Format` (`songId`,`itag`,`mimeType`,`bitrate`,`contentLength`,`lastModified`,`loudnessDb`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Format value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getItag() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getItag());
        }
        if (value.getMimeType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMimeType());
        }
        if (value.getBitrate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getBitrate());
        }
        if (value.getContentLength() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getContentLength());
        }
        if (value.getLastModified() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getLastModified());
        }
        if (value.getLoudnessDb() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLoudnessDb());
        }
      }
    };
    this.__insertionAdapterOfSearchQuery = new EntityInsertionAdapter<SearchQuery>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SearchQuery` (`id`,`query`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchQuery value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuery() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuery());
        }
      }
    };
    this.__insertionAdapterOfPlaylist = new EntityInsertionAdapter<Playlist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Playlist` (`id`,`name`,`browseId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Playlist value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getBrowseId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBrowseId());
        }
      }
    };
    this.__insertionAdapterOfSongPlaylistMap = new EntityInsertionAdapter<SongPlaylistMap>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `SongPlaylistMap` (`songId`,`playlistId`,`position`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongPlaylistMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        stmt.bindLong(2, value.getPlaylistId());
        stmt.bindLong(3, value.getPosition());
      }
    };
    this.__insertionAdapterOfSongArtistMap = new EntityInsertionAdapter<SongArtistMap>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `SongArtistMap` (`songId`,`artistId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongArtistMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getArtistId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getArtistId());
        }
      }
    };
    this.__insertionAdapterOfSong = new EntityInsertionAdapter<Song>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Song` (`id`,`title`,`artistsText`,`durationText`,`thumbnailUrl`,`likedAt`,`totalPlayTimeMs`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Song value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getArtistsText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getArtistsText());
        }
        if (value.getDurationText() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDurationText());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
        if (value.getLikedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getLikedAt());
        }
        stmt.bindLong(7, value.getTotalPlayTimeMs());
      }
    };
    this.__insertionAdapterOfQueuedMediaItem = new EntityInsertionAdapter<QueuedMediaItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `QueuedMediaItem` (`id`,`mediaItem`,`position`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QueuedMediaItem value) {
        stmt.bindLong(1, value.getId());
        final byte[] _tmp = Converters.INSTANCE.mediaItemToByteArray(value.getMediaItem());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindBlob(2, _tmp);
        }
        if (value.getPosition() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPosition());
        }
      }
    };
    this.__insertionAdapterOfAlbum = new EntityInsertionAdapter<Album>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Album` (`id`,`title`,`thumbnailUrl`,`year`,`authorsText`,`shareUrl`,`timestamp`,`bookmarkedAt`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Album value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getYear());
        }
        if (value.getAuthorsText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthorsText());
        }
        if (value.getShareUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getShareUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getBookmarkedAt());
        }
      }
    };
    this.__insertionAdapterOfSongAlbumMap = new EntityInsertionAdapter<SongAlbumMap>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `SongAlbumMap` (`songId`,`albumId`,`position`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongAlbumMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlbumId());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPosition());
        }
      }
    };
    this.__insertionAdapterOfArtist = new EntityInsertionAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Artist` (`id`,`name`,`thumbnailUrl`,`timestamp`,`bookmarkedAt`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getBookmarkedAt());
        }
      }
    };
    this.__insertionAdapterOfSongArtistMap_1 = new EntityInsertionAdapter<SongArtistMap>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `SongArtistMap` (`songId`,`artistId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongArtistMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getArtistId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getArtistId());
        }
      }
    };
    this.__deletionAdapterOfSearchQuery = new EntityDeletionOrUpdateAdapter<SearchQuery>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SearchQuery` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchQuery value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfPlaylist = new EntityDeletionOrUpdateAdapter<Playlist>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Playlist` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Playlist value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfSongPlaylistMap = new EntityDeletionOrUpdateAdapter<SongPlaylistMap>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SongPlaylistMap` WHERE `songId` = ? AND `playlistId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongPlaylistMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        stmt.bindLong(2, value.getPlaylistId());
      }
    };
    this.__updateAdapterOfArtist = new EntityDeletionOrUpdateAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Artist` SET `id` = ?,`name` = ?,`thumbnailUrl` = ?,`timestamp` = ?,`bookmarkedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getBookmarkedAt());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
      }
    };
    this.__updateAdapterOfAlbum = new EntityDeletionOrUpdateAdapter<Album>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Album` SET `id` = ?,`title` = ?,`thumbnailUrl` = ?,`year` = ?,`authorsText` = ?,`shareUrl` = ?,`timestamp` = ?,`bookmarkedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Album value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getYear());
        }
        if (value.getAuthorsText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthorsText());
        }
        if (value.getShareUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getShareUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getBookmarkedAt());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getId());
        }
      }
    };
    this.__updateAdapterOfPlaylist = new EntityDeletionOrUpdateAdapter<Playlist>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Playlist` SET `id` = ?,`name` = ?,`browseId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Playlist value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getBrowseId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBrowseId());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfClearQueue = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM QueuedMediaItem";
        return _query;
      }
    };
    this.__preparedStmtOfClearQueries = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SearchQuery";
        return _query;
      }
    };
    this.__preparedStmtOfLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Song SET likedAt = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDurationText = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Song SET durationText = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfIncrementTotalPlayTimeMs = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Song SET totalPlayTimeMs = totalPlayTimeMs + ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMove = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE SongPlaylistMap SET position = \n"
                + "          CASE \n"
                + "            WHEN position < ? THEN position + 1\n"
                + "            WHEN position > ? THEN position - 1\n"
                + "            ELSE ?\n"
                + "          END \n"
                + "        WHERE playlistId = ? AND position BETWEEN MIN(?,?) and MAX(?,?)\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfClearPlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SongPlaylistMap WHERE playlistId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAlbum = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SongAlbumMap WHERE albumId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearEvents = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Event";
        return _query;
      }
    };
    this.__preparedStmtOfClearEventsFor = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Event WHERE songId = ?";
        return _query;
      }
    };
    this.__upsertionAdapterOfLyrics = new EntityUpsertionAdapter<Lyrics>(new EntityInsertionAdapter<Lyrics>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `Lyrics` (`songId`,`fixed`,`synced`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lyrics value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getFixed() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFixed());
        }
        if (value.getSynced() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSynced());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<Lyrics>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `Lyrics` SET `songId` = ?,`fixed` = ?,`synced` = ? WHERE `songId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lyrics value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getFixed() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFixed());
        }
        if (value.getSynced() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSynced());
        }
        if (value.getSongId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSongId());
        }
      }
    });
    this.__upsertionAdapterOfAlbum = new EntityUpsertionAdapter<Album>(new EntityInsertionAdapter<Album>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `Album` (`id`,`title`,`thumbnailUrl`,`year`,`authorsText`,`shareUrl`,`timestamp`,`bookmarkedAt`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Album value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getYear());
        }
        if (value.getAuthorsText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthorsText());
        }
        if (value.getShareUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getShareUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getBookmarkedAt());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<Album>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `Album` SET `id` = ?,`title` = ?,`thumbnailUrl` = ?,`year` = ?,`authorsText` = ?,`shareUrl` = ?,`timestamp` = ?,`bookmarkedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Album value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getYear() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getYear());
        }
        if (value.getAuthorsText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthorsText());
        }
        if (value.getShareUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getShareUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getBookmarkedAt());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getId());
        }
      }
    });
    this.__upsertionAdapterOfSongAlbumMap = new EntityUpsertionAdapter<SongAlbumMap>(new EntityInsertionAdapter<SongAlbumMap>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `SongAlbumMap` (`songId`,`albumId`,`position`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongAlbumMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlbumId());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPosition());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<SongAlbumMap>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `SongAlbumMap` SET `songId` = ?,`albumId` = ?,`position` = ? WHERE `songId` = ? AND `albumId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongAlbumMap value) {
        if (value.getSongId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSongId());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAlbumId());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPosition());
        }
        if (value.getSongId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSongId());
        }
        if (value.getAlbumId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAlbumId());
        }
      }
    });
    this.__upsertionAdapterOfArtist = new EntityUpsertionAdapter<Artist>(new EntityInsertionAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `Artist` (`id`,`name`,`thumbnailUrl`,`timestamp`,`bookmarkedAt`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getBookmarkedAt());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<Artist>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `Artist` SET `id` = ?,`name` = ?,`thumbnailUrl` = ?,`timestamp` = ?,`bookmarkedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Artist value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getThumbnailUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimestamp());
        }
        if (value.getBookmarkedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getBookmarkedAt());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getId());
        }
      }
    });
  }

  @Override
  public void insert(final Event event) throws SQLException {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEvent.insert(event);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Format format) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFormat.insert(format);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final SearchQuery searchQuery) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSearchQuery.insert(searchQuery);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final Playlist playlist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPlaylist.insertAndReturnId(playlist);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final SongPlaylistMap songPlaylistMap) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSongPlaylistMap.insertAndReturnId(songPlaylistMap);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final SongArtistMap songArtistMap) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSongArtistMap.insertAndReturnId(songArtistMap);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(final Song song) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSong.insertAndReturnId(song);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<QueuedMediaItem> queuedMediaItems) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQueuedMediaItem.insert(queuedMediaItems);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Album album, final SongAlbumMap songAlbumMap) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlbum.insert(album);
      __insertionAdapterOfSongAlbumMap.insert(songAlbumMap);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<Artist> artists, final List<SongArtistMap> songArtistMaps) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfArtist.insert(artists);
      __insertionAdapterOfSongArtistMap_1.insert(songArtistMaps);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSongPlaylistMaps(final List<SongPlaylistMap> songPlaylistMaps) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSongPlaylistMap.insert(songPlaylistMaps);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SearchQuery searchQuery) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSearchQuery.handle(searchQuery);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Playlist playlist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlaylist.handle(playlist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SongPlaylistMap songPlaylistMap) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSongPlaylistMap.handle(songPlaylistMap);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Artist artist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfArtist.handle(artist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Album album) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAlbum.handle(album);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Playlist playlist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPlaylist.handle(playlist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final MediaItem mediaItem, final Function1<? super Song, Song> block) {
    __db.beginTransaction();
    try {
      Database.DefaultImpls.insert(Database_Impl.this, mediaItem, block);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearQueue() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearQueue.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearQueue.release(_stmt);
    }
  }

  @Override
  public void clearQueries() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearQueries.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearQueries.release(_stmt);
    }
  }

  @Override
  public int like(final String songId, final Long likedAt) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfLike.acquire();
    int _argIndex = 1;
    if (likedAt == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, likedAt);
    }
    _argIndex = 2;
    if (songId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, songId);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfLike.release(_stmt);
    }
  }

  @Override
  public int updateDurationText(final String songId, final String durationText) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDurationText.acquire();
    int _argIndex = 1;
    if (durationText == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, durationText);
    }
    _argIndex = 2;
    if (songId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, songId);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateDurationText.release(_stmt);
    }
  }

  @Override
  public void incrementTotalPlayTimeMs(final String id, final long addition) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfIncrementTotalPlayTimeMs.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, addition);
    _argIndex = 2;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfIncrementTotalPlayTimeMs.release(_stmt);
    }
  }

  @Override
  public void move(final long playlistId, final int fromPosition, final int toPosition) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMove.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, fromPosition);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, fromPosition);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, toPosition);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, playlistId);
    _argIndex = 5;
    _stmt.bindLong(_argIndex, fromPosition);
    _argIndex = 6;
    _stmt.bindLong(_argIndex, toPosition);
    _argIndex = 7;
    _stmt.bindLong(_argIndex, fromPosition);
    _argIndex = 8;
    _stmt.bindLong(_argIndex, toPosition);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMove.release(_stmt);
    }
  }

  @Override
  public void clearPlaylist(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearPlaylist.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearPlaylist.release(_stmt);
    }
  }

  @Override
  public void clearAlbum(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAlbum.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAlbum.release(_stmt);
    }
  }

  @Override
  public void clearEvents() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearEvents.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearEvents.release(_stmt);
    }
  }

  @Override
  public void clearEventsFor(final String songId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearEventsFor.acquire();
    int _argIndex = 1;
    if (songId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, songId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearEventsFor.release(_stmt);
    }
  }

  @Override
  public void upsert(final Lyrics lyrics) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __upsertionAdapterOfLyrics.upsert(lyrics);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsert(final Album album, final List<SongAlbumMap> songAlbumMaps) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __upsertionAdapterOfAlbum.upsert(album);
      __upsertionAdapterOfSongAlbumMap.upsert(songAlbumMaps);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsert(final SongAlbumMap songAlbumMap) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __upsertionAdapterOfSongAlbumMap.upsert(songAlbumMap);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsert(final Artist artist) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __upsertionAdapterOfArtist.upsert(artist);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<Song>> songsByRowIdAsc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> songsByRowIdDesc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY ROWID DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> songsByTitleAsc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> songsByTitleDesc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY title DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> songsByPlayTimeAsc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> songsByPlayTimeDesc() {
    final String _sql = "SELECT * FROM Song WHERE totalPlayTimeMs > 0 ORDER BY totalPlayTimeMs DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> favorites() {
    final String _sql = "SELECT * FROM Song WHERE likedAt IS NOT NULL ORDER BY likedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<QueuedMediaItem> queue() {
    final String _sql = "SELECT * FROM QueuedMediaItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMediaItem = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaItem");
      final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
      final List<QueuedMediaItem> _result = new ArrayList<QueuedMediaItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final QueuedMediaItem _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final MediaItem _tmpMediaItem;
        final byte[] _tmp;
        if (_cursor.isNull(_cursorIndexOfMediaItem)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getBlob(_cursorIndexOfMediaItem);
        }
        _tmpMediaItem = Converters.INSTANCE.mediaItemFromByteArray(_tmp);
        final Long _tmpPosition;
        if (_cursor.isNull(_cursorIndexOfPosition)) {
          _tmpPosition = null;
        } else {
          _tmpPosition = _cursor.getLong(_cursorIndexOfPosition);
        }
        _item = new QueuedMediaItem(_tmpId,_tmpMediaItem,_tmpPosition);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flow<List<SearchQuery>> queries(final String query) {
    final String _sql = "SELECT * FROM SearchQuery WHERE query LIKE ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"SearchQuery"}, new Callable<List<SearchQuery>>() {
      @Override
      public List<SearchQuery> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuery = CursorUtil.getColumnIndexOrThrow(_cursor, "query");
          final List<SearchQuery> _result = new ArrayList<SearchQuery>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SearchQuery _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpQuery;
            if (_cursor.isNull(_cursorIndexOfQuery)) {
              _tmpQuery = null;
            } else {
              _tmpQuery = _cursor.getString(_cursorIndexOfQuery);
            }
            _item = new SearchQuery(_tmpId,_tmpQuery);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> queriesCount() {
    final String _sql = "SELECT COUNT (*) FROM SearchQuery";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"SearchQuery"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Song> song(final String id) {
    final String _sql = "SELECT * FROM Song WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Song"}, new Callable<Song>() {
      @Override
      public Song call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
          final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
          final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
          final Song _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpArtistsText;
            if (_cursor.isNull(_cursorIndexOfArtistsText)) {
              _tmpArtistsText = null;
            } else {
              _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
            }
            final String _tmpDurationText;
            if (_cursor.isNull(_cursorIndexOfDurationText)) {
              _tmpDurationText = null;
            } else {
              _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpLikedAt;
            if (_cursor.isNull(_cursorIndexOfLikedAt)) {
              _tmpLikedAt = null;
            } else {
              _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
            }
            final long _tmpTotalPlayTimeMs;
            _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
            _result = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Long> likedAt(final String songId) {
    final String _sql = "SELECT likedAt FROM Song WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Song"}, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getLong(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Lyrics> lyrics(final String songId) {
    final String _sql = "SELECT * FROM Lyrics WHERE songId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Lyrics"}, new Callable<Lyrics>() {
      @Override
      public Lyrics call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSongId = CursorUtil.getColumnIndexOrThrow(_cursor, "songId");
          final int _cursorIndexOfFixed = CursorUtil.getColumnIndexOrThrow(_cursor, "fixed");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final Lyrics _result;
          if(_cursor.moveToFirst()) {
            final String _tmpSongId;
            if (_cursor.isNull(_cursorIndexOfSongId)) {
              _tmpSongId = null;
            } else {
              _tmpSongId = _cursor.getString(_cursorIndexOfSongId);
            }
            final String _tmpFixed;
            if (_cursor.isNull(_cursorIndexOfFixed)) {
              _tmpFixed = null;
            } else {
              _tmpFixed = _cursor.getString(_cursorIndexOfFixed);
            }
            final String _tmpSynced;
            if (_cursor.isNull(_cursorIndexOfSynced)) {
              _tmpSynced = null;
            } else {
              _tmpSynced = _cursor.getString(_cursorIndexOfSynced);
            }
            _result = new Lyrics(_tmpSongId,_tmpFixed,_tmpSynced);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Artist> artist(final String id) {
    final String _sql = "SELECT * FROM Artist WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Artist"}, new Callable<Artist>() {
      @Override
      public Artist call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final Artist _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _result = new Artist(_tmpId,_tmpName,_tmpThumbnailUrl,_tmpTimestamp,_tmpBookmarkedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Artist>> artistsByNameDesc() {
    final String _sql = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Artist"}, new Callable<List<Artist>>() {
      @Override
      public List<Artist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Artist _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Artist(_tmpId,_tmpName,_tmpThumbnailUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Artist>> artistsByNameAsc() {
    final String _sql = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Artist"}, new Callable<List<Artist>>() {
      @Override
      public List<Artist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Artist _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Artist(_tmpId,_tmpName,_tmpThumbnailUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Artist>> artistsByRowIdDesc() {
    final String _sql = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Artist"}, new Callable<List<Artist>>() {
      @Override
      public List<Artist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Artist _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Artist(_tmpId,_tmpName,_tmpThumbnailUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Artist>> artistsByRowIdAsc() {
    final String _sql = "SELECT * FROM Artist WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Artist"}, new Callable<List<Artist>>() {
      @Override
      public List<Artist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Artist> _result = new ArrayList<Artist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Artist _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Artist(_tmpId,_tmpName,_tmpThumbnailUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Album> album(final String id) {
    final String _sql = "SELECT * FROM Album WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<Album>() {
      @Override
      public Album call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final Album _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _result = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Long albumTimestamp(final String id) {
    final String _sql = "SELECT timestamp FROM Album WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Long _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getLong(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flow<List<Song>> albumSongs(final String albumId) {
    final String _sql = "SELECT `id`, `title`, `artistsText`, `durationText`, `thumbnailUrl`, `likedAt`, `totalPlayTimeMs` FROM (SELECT * FROM Song JOIN SongAlbumMap ON Song.id = SongAlbumMap.songId WHERE SongAlbumMap.albumId = ? AND position IS NOT NULL ORDER BY position)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (albumId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, albumId);
    }
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song","SongAlbumMap"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfTitle = 1;
            final int _cursorIndexOfArtistsText = 2;
            final int _cursorIndexOfDurationText = 3;
            final int _cursorIndexOfThumbnailUrl = 4;
            final int _cursorIndexOfLikedAt = 5;
            final int _cursorIndexOfTotalPlayTimeMs = 6;
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByTitleAsc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByYearAsc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByRowIdAsc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByTitleDesc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY title DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByYearDesc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY year DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Album>> albumsByRowIdDesc() {
    final String _sql = "SELECT * FROM Album WHERE bookmarkedAt IS NOT NULL ORDER BY bookmarkedAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Album"}, new Callable<List<Album>>() {
      @Override
      public List<Album> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfAuthorsText = CursorUtil.getColumnIndexOrThrow(_cursor, "authorsText");
          final int _cursorIndexOfShareUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "shareUrl");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfBookmarkedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "bookmarkedAt");
          final List<Album> _result = new ArrayList<Album>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Album _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final String _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getString(_cursorIndexOfYear);
            }
            final String _tmpAuthorsText;
            if (_cursor.isNull(_cursorIndexOfAuthorsText)) {
              _tmpAuthorsText = null;
            } else {
              _tmpAuthorsText = _cursor.getString(_cursorIndexOfAuthorsText);
            }
            final String _tmpShareUrl;
            if (_cursor.isNull(_cursorIndexOfShareUrl)) {
              _tmpShareUrl = null;
            } else {
              _tmpShareUrl = _cursor.getString(_cursorIndexOfShareUrl);
            }
            final Long _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            final Long _tmpBookmarkedAt;
            if (_cursor.isNull(_cursorIndexOfBookmarkedAt)) {
              _tmpBookmarkedAt = null;
            } else {
              _tmpBookmarkedAt = _cursor.getLong(_cursorIndexOfBookmarkedAt);
            }
            _item = new Album(_tmpId,_tmpTitle,_tmpThumbnailUrl,_tmpYear,_tmpAuthorsText,_tmpShareUrl,_tmpTimestamp,_tmpBookmarkedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<PlaylistWithSongs> playlistWithSongs(final long id) {
    final String _sql = "SELECT * FROM Playlist WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SortedSongPlaylistMap","Song","Playlist"}, new Callable<PlaylistWithSongs>() {
      @Override
      public PlaylistWithSongs call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfBrowseId = CursorUtil.getColumnIndexOrThrow(_cursor, "browseId");
            final LongSparseArray<ArrayList<Song>> _collectionSongs = new LongSparseArray<ArrayList<Song>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<Song> _tmpSongsCollection = _collectionSongs.get(_tmpKey);
              if (_tmpSongsCollection == null) {
                _tmpSongsCollection = new ArrayList<Song>();
                _collectionSongs.put(_tmpKey, _tmpSongsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipSongAsitVfsfitvnmVimusicModelsSong(_collectionSongs);
            final PlaylistWithSongs _result;
            if(_cursor.moveToFirst()) {
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpBrowseId;
              if (_cursor.isNull(_cursorIndexOfBrowseId)) {
                _tmpBrowseId = null;
              } else {
                _tmpBrowseId = _cursor.getString(_cursorIndexOfBrowseId);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,_tmpBrowseId);
              ArrayList<Song> _tmpSongsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpSongsCollection_1 = _collectionSongs.get(_tmpKey_1);
              if (_tmpSongsCollection_1 == null) {
                _tmpSongsCollection_1 = new ArrayList<Song>();
              }
              _result = new PlaylistWithSongs(_tmpPlaylist,_tmpSongsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByNameAsc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByDateAddedAsc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByDateSongCountAsc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByNameDesc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY name DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByDateAddedDesc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY ROWID DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviewsByDateSongCountDesc() {
    final String _sql = "SELECT id, name, (SELECT COUNT(*) FROM SongPlaylistMap WHERE playlistId = id) as songCount FROM Playlist ORDER BY songCount DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"SongPlaylistMap","Playlist"}, new Callable<List<PlaylistPreview>>() {
      @Override
      public List<PlaylistPreview> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfName = 1;
            final int _cursorIndexOfSongCount = 2;
            final List<PlaylistPreview> _result = new ArrayList<PlaylistPreview>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistPreview _item;
              final int _tmpSongCount;
              _tmpSongCount = _cursor.getInt(_cursorIndexOfSongCount);
              final Playlist _tmpPlaylist;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              _tmpPlaylist = new Playlist(_tmpId,_tmpName,null);
              _item = new PlaylistPreview(_tmpPlaylist,_tmpSongCount);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<String>> playlistThumbnailUrls(final long id) {
    final String _sql = "SELECT thumbnailUrl FROM Song JOIN SongPlaylistMap ON id = songId WHERE playlistId = ? ORDER BY position LIMIT 4";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Song","SongPlaylistMap"}, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> artistSongs(final String artistId) {
    final String _sql = "SELECT `id`, `title`, `artistsText`, `durationText`, `thumbnailUrl`, `likedAt`, `totalPlayTimeMs` FROM (SELECT * FROM Song JOIN SongArtistMap ON Song.id = SongArtistMap.songId WHERE SongArtistMap.artistId = ? AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (artistId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, artistId);
    }
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song","SongArtistMap"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = 0;
            final int _cursorIndexOfTitle = 1;
            final int _cursorIndexOfArtistsText = 2;
            final int _cursorIndexOfDurationText = 3;
            final int _cursorIndexOfThumbnailUrl = 4;
            final int _cursorIndexOfLikedAt = 5;
            final int _cursorIndexOfTotalPlayTimeMs = 6;
            final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Song _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Format> format(final String songId) {
    final String _sql = "SELECT * FROM Format WHERE songId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Format"}, new Callable<Format>() {
      @Override
      public Format call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSongId = CursorUtil.getColumnIndexOrThrow(_cursor, "songId");
          final int _cursorIndexOfItag = CursorUtil.getColumnIndexOrThrow(_cursor, "itag");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
          final int _cursorIndexOfBitrate = CursorUtil.getColumnIndexOrThrow(_cursor, "bitrate");
          final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
          final int _cursorIndexOfLastModified = CursorUtil.getColumnIndexOrThrow(_cursor, "lastModified");
          final int _cursorIndexOfLoudnessDb = CursorUtil.getColumnIndexOrThrow(_cursor, "loudnessDb");
          final Format _result;
          if(_cursor.moveToFirst()) {
            final String _tmpSongId;
            if (_cursor.isNull(_cursorIndexOfSongId)) {
              _tmpSongId = null;
            } else {
              _tmpSongId = _cursor.getString(_cursorIndexOfSongId);
            }
            final Integer _tmpItag;
            if (_cursor.isNull(_cursorIndexOfItag)) {
              _tmpItag = null;
            } else {
              _tmpItag = _cursor.getInt(_cursorIndexOfItag);
            }
            final String _tmpMimeType;
            if (_cursor.isNull(_cursorIndexOfMimeType)) {
              _tmpMimeType = null;
            } else {
              _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            }
            final Long _tmpBitrate;
            if (_cursor.isNull(_cursorIndexOfBitrate)) {
              _tmpBitrate = null;
            } else {
              _tmpBitrate = _cursor.getLong(_cursorIndexOfBitrate);
            }
            final Long _tmpContentLength;
            if (_cursor.isNull(_cursorIndexOfContentLength)) {
              _tmpContentLength = null;
            } else {
              _tmpContentLength = _cursor.getLong(_cursorIndexOfContentLength);
            }
            final Long _tmpLastModified;
            if (_cursor.isNull(_cursorIndexOfLastModified)) {
              _tmpLastModified = null;
            } else {
              _tmpLastModified = _cursor.getLong(_cursorIndexOfLastModified);
            }
            final Float _tmpLoudnessDb;
            if (_cursor.isNull(_cursorIndexOfLoudnessDb)) {
              _tmpLoudnessDb = null;
            } else {
              _tmpLoudnessDb = _cursor.getFloat(_cursorIndexOfLoudnessDb);
            }
            _result = new Format(_tmpSongId,_tmpItag,_tmpMimeType,_tmpBitrate,_tmpContentLength,_tmpLastModified,_tmpLoudnessDb);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<SongWithContentLength>> songsWithContentLength() {
    final String _sql = "SELECT Song.*, contentLength FROM Song JOIN Format ON id = songId WHERE contentLength IS NOT NULL AND totalPlayTimeMs > 0 ORDER BY Song.ROWID DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Song","Format"}, new Callable<List<SongWithContentLength>>() {
      @Override
      public List<SongWithContentLength> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final int _cursorIndexOfContentLength = CursorUtil.getColumnIndexOrThrow(_cursor, "contentLength");
            final List<SongWithContentLength> _result = new ArrayList<SongWithContentLength>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final SongWithContentLength _item;
              final Long _tmpContentLength;
              if (_cursor.isNull(_cursorIndexOfContentLength)) {
                _tmpContentLength = null;
              } else {
                _tmpContentLength = _cursor.getLong(_cursorIndexOfContentLength);
              }
              final Song _tmpSong;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _tmpSong = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
              _item = new SongWithContentLength(_tmpSong,_tmpContentLength);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Float> loudnessDb(final String songId) {
    final String _sql = "SELECT loudnessDb FROM Format WHERE songId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Format"}, new Callable<Float>() {
      @Override
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getFloat(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Song>> search(final String query) {
    final String _sql = "SELECT * FROM Song WHERE title LIKE ? OR artistsText LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Song"}, new Callable<List<Song>>() {
      @Override
      public List<Song> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
          final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
          final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
          final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
          final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
          final List<Song> _result = new ArrayList<Song>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Song _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpArtistsText;
            if (_cursor.isNull(_cursorIndexOfArtistsText)) {
              _tmpArtistsText = null;
            } else {
              _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
            }
            final String _tmpDurationText;
            if (_cursor.isNull(_cursorIndexOfDurationText)) {
              _tmpDurationText = null;
            } else {
              _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
            }
            final String _tmpThumbnailUrl;
            if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
              _tmpThumbnailUrl = null;
            } else {
              _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            }
            final Long _tmpLikedAt;
            if (_cursor.isNull(_cursorIndexOfLikedAt)) {
              _tmpLikedAt = null;
            } else {
              _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
            }
            final long _tmpTotalPlayTimeMs;
            _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
            _item = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Info songAlbumInfo(final String songId) {
    final String _sql = "SELECT albumId AS id, NULL AS name FROM SongAlbumMap WHERE songId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfName = 1;
      final Info _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result = new Info(_tmpId,_tmpName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Info> songArtistInfo(final String songId) {
    final String _sql = "SELECT id, name FROM Artist LEFT JOIN SongArtistMap ON id = artistId WHERE songId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (songId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, songId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfName = 1;
      final List<Info> _result = new ArrayList<Info>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Info _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new Info(_tmpId,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flow<Song> trending(final long now) {
    final String _sql = "SELECT Song.* FROM Event JOIN Song ON Song.id = songId GROUP BY songId ORDER BY SUM(CAST(playTime AS REAL) / (((? - timestamp) / 86400000) + 1)) DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, now);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"Event","Song"}, new Callable<Song>() {
      @Override
      public Song call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfArtistsText = CursorUtil.getColumnIndexOrThrow(_cursor, "artistsText");
            final int _cursorIndexOfDurationText = CursorUtil.getColumnIndexOrThrow(_cursor, "durationText");
            final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
            final int _cursorIndexOfLikedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "likedAt");
            final int _cursorIndexOfTotalPlayTimeMs = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPlayTimeMs");
            final Song _result;
            if(_cursor.moveToFirst()) {
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpArtistsText;
              if (_cursor.isNull(_cursorIndexOfArtistsText)) {
                _tmpArtistsText = null;
              } else {
                _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
              }
              final String _tmpDurationText;
              if (_cursor.isNull(_cursorIndexOfDurationText)) {
                _tmpDurationText = null;
              } else {
                _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
              }
              final String _tmpThumbnailUrl;
              if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
                _tmpThumbnailUrl = null;
              } else {
                _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
              }
              final Long _tmpLikedAt;
              if (_cursor.isNull(_cursorIndexOfLikedAt)) {
                _tmpLikedAt = null;
              } else {
                _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
              }
              final long _tmpTotalPlayTimeMs;
              _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
              _result = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> eventsCount() {
    final String _sql = "SELECT COUNT (*) FROM Event";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Event"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int raw(final SupportSQLiteQuery supportSQLiteQuery) {
    final SupportSQLiteQuery _internalQuery = supportSQLiteQuery;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public Flow<List<Song>> songs(final SongSortBy sortBy, final SortOrder sortOrder) {
    return Database.DefaultImpls.songs(Database_Impl.this, sortBy, sortOrder);
  }

  @Override
  public Flow<List<Artist>> artists(final ArtistSortBy sortBy, final SortOrder sortOrder) {
    return Database.DefaultImpls.artists(Database_Impl.this, sortBy, sortOrder);
  }

  @Override
  public Flow<List<Album>> albums(final AlbumSortBy sortBy, final SortOrder sortOrder) {
    return Database.DefaultImpls.albums(Database_Impl.this, sortBy, sortOrder);
  }

  @Override
  public Flow<List<PlaylistPreview>> playlistPreviews(final PlaylistSortBy sortBy,
      final SortOrder sortOrder) {
    return Database.DefaultImpls.playlistPreviews(Database_Impl.this, sortBy, sortOrder);
  }

  @Override
  public void checkpoint() {
    Database.DefaultImpls.checkpoint(Database_Impl.this);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipSongAsitVfsfitvnmVimusicModelsSong(
      final LongSparseArray<ArrayList<Song>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Song>> _tmpInnerMap = new LongSparseArray<ArrayList<Song>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipSongAsitVfsfitvnmVimusicModelsSong(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Song>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipSongAsitVfsfitvnmVimusicModelsSong(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `Song`.`id` AS `id`,`Song`.`title` AS `title`,`Song`.`artistsText` AS `artistsText`,`Song`.`durationText` AS `durationText`,`Song`.`thumbnailUrl` AS `thumbnailUrl`,`Song`.`likedAt` AS `likedAt`,`Song`.`totalPlayTimeMs` AS `totalPlayTimeMs`,_junction.`playlistId` FROM `SortedSongPlaylistMap` AS _junction INNER JOIN `Song` ON (_junction.`songId` = `Song`.`id`) WHERE _junction.`playlistId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 7; // _junction.playlistId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTitle = 1;
      final int _cursorIndexOfArtistsText = 2;
      final int _cursorIndexOfDurationText = 3;
      final int _cursorIndexOfThumbnailUrl = 4;
      final int _cursorIndexOfLikedAt = 5;
      final int _cursorIndexOfTotalPlayTimeMs = 6;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Song> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Song _item_1;
          final String _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getString(_cursorIndexOfId);
          }
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpArtistsText;
          if (_cursor.isNull(_cursorIndexOfArtistsText)) {
            _tmpArtistsText = null;
          } else {
            _tmpArtistsText = _cursor.getString(_cursorIndexOfArtistsText);
          }
          final String _tmpDurationText;
          if (_cursor.isNull(_cursorIndexOfDurationText)) {
            _tmpDurationText = null;
          } else {
            _tmpDurationText = _cursor.getString(_cursorIndexOfDurationText);
          }
          final String _tmpThumbnailUrl;
          if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
            _tmpThumbnailUrl = null;
          } else {
            _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
          }
          final Long _tmpLikedAt;
          if (_cursor.isNull(_cursorIndexOfLikedAt)) {
            _tmpLikedAt = null;
          } else {
            _tmpLikedAt = _cursor.getLong(_cursorIndexOfLikedAt);
          }
          final long _tmpTotalPlayTimeMs;
          _tmpTotalPlayTimeMs = _cursor.getLong(_cursorIndexOfTotalPlayTimeMs);
          _item_1 = new Song(_tmpId,_tmpTitle,_tmpArtistsText,_tmpDurationText,_tmpThumbnailUrl,_tmpLikedAt,_tmpTotalPlayTimeMs);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
