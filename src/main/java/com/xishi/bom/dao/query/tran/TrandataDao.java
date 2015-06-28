package com.xishi.bom.dao.query.tran;

import com.xishi.bom.entity.tran.Trandata;
import com.xishi.bom.vo.tran.TrandataVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TrandataDao {
    List<Trandata> getAll(TrandataVo trandataVo);
}
