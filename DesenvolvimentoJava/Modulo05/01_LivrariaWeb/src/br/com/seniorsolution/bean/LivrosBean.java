package br.com.seniorsolution.bean;

import java.io.InputStream;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

import org.primefaces.model.UploadedFile;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Livro;

//@ManagedBean
@ManagedBean(name="bLivro")
//@SessionScoped
public class LivrosBean {

	private Livro livro;
	private Part part;
	private UploadedFile file;
	
	public LivrosBean() {
		livro = new Livro();
	}

	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

//	public void handleFileUpload(FileUploadEvent event) {
//		try {
//			UploadedFile file = event.getFile();
//			System.out.println(file.getFileName());
//			InputStream inputStream = file.getInputstream();
//			System.out.println("tamanho da imagem" + file.getSize());
//			byte[] img = new byte[(int)file.getSize()];
//			System.out.println("tamanho do arraqy"+ img.length);
//			inputStream.read(img, 0, (int)file.getSize());
//			
//			this.livro.setImagem(img);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block fileUploadListener="#{bLivro.handleFileUpload}"
//			e.printStackTrace();
//		}
//    }
	
//	action incluir livro
	public String incluirLivro() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage();
		msg.setSummary("Info : ");
		try {	
			GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
			InputStream inputStream = this.getFile().getInputstream();
			byte[] img = new byte[(int)this.getFile().getSize()];
			inputStream.read(img, 0, (int)this.getFile().getSize());
			this.livro.setImagem(img);
			
			dao.adicionar(this.livro);
			msg.setDetail("Livro incluido com sucesso");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
			context.addMessage(null, msg);
			this.setLivro(new Livro());
			return "cadLivros";
		} catch (Exception e) {
			msg.setDetail("Erro ao incluir revis�o ");
			msg.setSeverity(FacesMessage.SEVERITY_FATAL);
			context.addMessage(null, msg);
			return "erro";
		}
	}
	
//	action listar livros
	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
		return dao.listar();
	}
}
