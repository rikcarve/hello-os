# hello-os
Sample app for openshift tests

## Openshift template
The openshift.yml file containes a pretty generic template to build and deploy a wildfly based, maven+jenkinsfile built application

## Kubernetes on raspberry pi

 https://medium.com/nycdev/k8s-on-pi-9cc14843d43
 https://kubecloud.io/setting-up-a-kubernetes-1-11-raspberry-pi-cluster-using-kubeadm-952bbda329c8
 
 - sudo vim /etc/systemd/system/kubelet.service.d/10-kubeadm.conf
    --cgroups-per-qos=false  --enforce-node-allocatable=''

 - Simply clear out all contents of /var/lib/docker/overlay2? Wouldn't that risk data loss? --> Delete all docker  images first
	

kubectl taint nodes --all node-role.kubernetes.io/master-node/k8s-all-in-one untainted
kubectl create deployment nginx --image=arm32v7/nginx

kubectl expose deployment/nginx --type="NodePort" --port 80
kubectl scale deployments/nginx --replicas=2
