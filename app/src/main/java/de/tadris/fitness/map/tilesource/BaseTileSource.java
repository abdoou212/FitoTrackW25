package de.tadris.fitness.map.tilesource;

import org.mapsforge.core.model.Tile;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTileSource extends FitoTrackTileSource {

    private final int parallelRequestsLimit;
    private final String protocol;
    private final int zoomLevelMax;
    private final int zoomLevelMin;
    private final String name;
    private final String urlPath;

    protected BaseTileSource(String[] hostNames, int port, int parallelRequestsLimit, String protocol,
                             int zoomLevelMax, int zoomLevelMin, String name, String urlPath) {
        super(hostNames, port);
        this.parallelRequestsLimit = parallelRequestsLimit;
        this.protocol = protocol;
        this.zoomLevelMax = zoomLevelMax;
        this.zoomLevelMin = zoomLevelMin;
        this.name = name;
        this.urlPath = urlPath;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getParallelRequestsLimit() {
        return parallelRequestsLimit;
    }

    @Override
    public URL getTileUrl(Tile tile) throws MalformedURLException {
        return new URL(protocol, getHostName(), this.port, urlPath + tile.zoomLevel + '/' + tile.tileX + '/' + tile.tileY + ".png");
    }

    @Override
    public byte getZoomLevelMax() {
        return (byte) zoomLevelMax;
    }

    @Override
    public byte getZoomLevelMin() {
        return (byte) zoomLevelMin;
    }
}