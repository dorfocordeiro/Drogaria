package br.com.rodolfo.drogaria.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.rodolfo.drogaria.util.HibernateUtil;

public class GenericDao<DominiosType> {
	private Class<DominiosType> classe;

	@SuppressWarnings("unchecked")
	public GenericDao() {
		this.classe = (Class<DominiosType>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public void salvar(DominiosType entidade) {

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}

	}

	public List<DominiosType> listar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
	
		try {
			
		}
		catch (RuntimeException erro){
			
		}

		finally {
			sessao.close();
		}
		return null;
	
	
	
	
	}
}
