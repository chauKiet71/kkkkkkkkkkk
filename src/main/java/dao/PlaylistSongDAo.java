/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Table.Model_Table;
import entity.PlaylistSong;
import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.XJdbcc;

/**
 *
 * @author PC
 */
public class PlaylistSongDAo {

    String INSERT = "INSERT INTO PlaylistSong (AnhBaihat, TenBaiHat, CaSi, SoLuotNghe, Thoigian) VALUES (?,?,?,?,?)";

    public void insert(PlaylistSong entity) {
        try {
            XJdbcc.update(INSERT, entity.getAnhBaiHat(), entity.getTenBaihat(), entity.getCaSi(), entity.getLuotXem(), entity.getThoiGian());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
