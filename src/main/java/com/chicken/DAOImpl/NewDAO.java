package com.chicken.DAOImpl;

import java.util.List;

import com.chicken.DAO.INewDAO;
import com.chicken.mapper.NewMapper;
import com.chicken.model.NewModel;
import com.chicken.paging.Pageble;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = " SELECT * FROM news WHERE categoryid= ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO news (title, content,");
		sql.append("thumbnail, shortdescription,categoryid,createddate,createdby)");
		sql.append("VALUES(? ,? , ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newModel.getTitle(), newModel.getContent(), newModel.getCategoryid(),
				newModel.getThumbnail(), newModel.getCategoryid(), newModel.getCreatedDate(), 
				newModel.getCreatedBy());
	}

	@Override
	public NewModel findOne(Long id) {
		String sql = " SELECT * FROM news WHERE id = ?";
		List<NewModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append(" shortdescription = ?, content = ?, categoryid = ?,");
		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortdescription(),
				updateNew.getContent(), updateNew.getCategoryid(), updateNew.getCreatedDate(), updateNew.getCreatedBy(),
				updateNew.getModifiedDate(), updateNew.getModifiedBy(), updateNew.getId());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM news WHERE id=?";
		update(sql, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NewModel> findAll(Pageble pageble) {
		//String sql = " SELECT * FROM news LIMIT ?, ?";
		StringBuilder sql  = new StringBuilder("SELECT * FROM news");
		if(pageble.getSorter() != null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if(pageble.getOffSet() != null) {
			sql.append(" LIMIT "+pageble.getOffSet()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new NewMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM news";
		return count(sql);
	}

}
