import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;

@ManagedBean // nome será 'estadoBean'
@ViewScoped
public class EstadoBean implements Serializable {
    public void salvar(ActionEvent event) {
        System.out.println("Botão funcionando!");
    }
}