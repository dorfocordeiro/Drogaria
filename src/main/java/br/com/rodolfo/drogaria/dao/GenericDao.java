package br.com.rodolfo.drogaria.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.rodolfo.drogaria.util.HibernateUtil;
import org.hibernate.criterion.Restrictions;

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
			
			Criteria consulta = sessao.createCriteria(classe);
			List<DominiosType> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {

		} finally {
			sessao.close();
		}
		return null;

	}


	@SuppressWarnings("unchecked")
	public DominiosType buscar(Long codigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			consulta.add(Restrictions.idEq(codigo));
			DominiosType resultado = (DominiosType) consulta.uniqueResult();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

	public void excluir(DominiosType entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			transacao.commit();

		}
		catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();

			}
			throw erro;

		}
		finally {
			sessao.close();
		}


	}

	public void editar(DominiosType entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
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

}
